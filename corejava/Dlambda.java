import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;

public class Dlambda {
    public static void main(String[] args) {

        Thread th = new Thread(()-> System.out.println("Inside thread"));
        th.start();
        /*
        Above code can be written as below. In the above line we are just passing a function as lambda expr
        Thread th = new Thread(new Runnable(){
            public void run(){
                System.out.println("Inside thread");
            }
        })
        */
        System.out.println("Inside main");

        //Looping
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(i);
        }

        for (Integer i : nums) {
            System.out.println(i);
        }

        //Above are external iterators

        //Internal Iterators
        nums.forEach(new Consumer<Integer>(){
            public void accept(Integer e){
                System.out.println(e);
            }
        });

        //The above code in Lambda expressions
        nums.forEach((Integer e)->System.out.println(e));
        //Below all are same
        // nums.forEach((e)->System.out.println(e));//Type inference is also not needed
        // nums.forEach(e->System.out.println(e));//for single param even parantheses is not needed
        // nums.forEach(System.out::println); //Since only one param we removed the reference to it

        //imperative coding ex below
        //we tell what to do - to a code block
        //and then we also define how to do it
        //Lot of variable mutability inside the code
        
        //Find the total of double of Even numbers
        int result = 0;

        for (Integer integer : nums) {
            if(integer %2 == 0){
                result += integer*2;
            }
        }
        System.out.println(result);

        //Declarative code for the same result
        System.out.println(
            nums.stream()
            .filter(e -> e % 2 == 0)
            .mapToInt( e -> e*2)
            .sum()
        );
        
        nums.stream()
            .filter(e -> e % 2 == 0)
            .mapToInt( e -> e*2)
            .forEach(System.out::println);//until this operation the prev ops are not going to execute
            //This is lazy evaluation and hence efficient execution
    }
}
