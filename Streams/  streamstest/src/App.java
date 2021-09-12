import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Hello, World!");
        IntStream.range(1, 10).skip(5).forEach(System.out::print);
        System.out.println();

        System.out.println(IntStream.range(1, 5).sum());

        // Strem.of sorted and find first
        Stream.of("Ava ", "Deepak", "Hellow").sorted().findFirst().ifPresent(System.out::println);

        // Stream from Array sort filter print
        String[] names = { "AI", "Deepak", "Geeta", "Hans", "Amanda", "Sarika", "Brent", "David" };
        Arrays.stream(names) // Same as Stream.of(names)
                .filter(x -> x.startsWith("D")).sorted().forEach(System.out::println);

        // Average of sqaures of int array
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).forEach(System.out::println);

        // Stream from List
        List<String> people = Arrays.asList(names);
        people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("d")).forEach(System.out::println);
        // Collect collects the results from stream into a new list
        List<String> people2 = people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("d"))
                .collect(Collectors.toList());
        people2.forEach(System.out::println);

        // lets see if we can achieve the same with reduce
    }
}