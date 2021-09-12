package javaworkshop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Deepak Singh
Created on: 03/07/2021 15:16
This is based on Java Workshop book
*/
public class MyLists {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
        list.add("Deepak");
        list.add("How");
        list.add("Are");
        list.add("You");
        list.add("Today");
        String[] text = {"Hello","Deepak","How","Are","You","Today"};
        list = Arrays.asList(text);
        System.out.println(list);
        // list.subList(2, 4).clear();//This will remove the sublist from list 
        // System.out.println(list);
        System.out.println("Ordered List Collections.sort");
        
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Shuffled List Collections.shuffle");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("Shuffled again List Collections.shuffle");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("Rotated  List Collections.rotate");
        Collections.rotate(list, 3);
        System.out.println(list);
        System.out.println("Reversed List Collections.reverse");
        Collections.reverse(list);
        System.out.println(list);
    }
}
