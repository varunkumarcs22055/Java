import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamAPi {
    public static void main(String[] args) {
        // Stream API in Java
        // Stream API is used to process collections of objects in a functional style.
        // It allows us to perform operations like filter, map, and reduce on collections.
        // Streams can be sequential or parallel.
        // A stream is not a data structure; it does not store elements. It simply conveys elements from a source
        // such as a collection, an array, or an I/O channel, through a pipeline of computational operations.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Using Stream API to filter even numbers and print them
        Stream<Integer> s1 = numbers.stream();
        Stream<Integer> evenNumbers = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s2 = evenNumbers.map(n -> n * n); // Squaring the even numbers
        int result = s2.reduce(0, (a, b) -> a + b); // Summing the squared even numbers
        System.out.println("Sum of squares of even numbers: " + result);
        // evenNumbers.forEach(n -> System.out.println(n));

        int result2 = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * n)
                            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of squares of even numbers: " + result2);


        // Predicates 
        // This is how Filter works using Predicate functional interface
        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer n){
                return n % 2 == 0;
            }
        };

        int result3 = numbers.stream()
                            .filter(p) // Using predicate to filter even numbers
                            .map(n -> n * n)
                            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of squares of even numbers: " + result3);


        // This is how Map works using Function functional interface
        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {
                return n * n;
            }
        };

        int result4 = numbers.stream()
                            .filter(p)
                            .map(fun) // Using function to square the numbers
                            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of squares of even numbers: " + result4);


    }
}
