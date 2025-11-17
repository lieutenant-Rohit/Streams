package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        //Intermediate Operation -> Transform stream into another stream

        //1. Filter
        List<String> list = Arrays.asList("Ankit","Shivani","Deepika","Harshita","Rohit","Anshika");
        Stream<String> filteredStream = list.stream().filter(x->x.startsWith("A"));
        //No filtering done until terminal operation.
        long res = filteredStream.count();
        System.out.println(res);

        //2. Map
        System.out.println("--------------------");
        Stream<String> upperCaseStream = list.stream().map(x->x.toUpperCase());
        upperCaseStream.forEach(System.out::println);

        //3. Sorted
        System.out.println("--------------------");
        Stream<String> sortedStream = list.stream().sorted();
        sortedStream.forEach(System.out::println);

        //4. Limit
        Stream<Integer> stream = Stream.generate(()->1).limit(4);
        stream.forEach(System.out::print);
        System.out.println();
        System.out.println("--------------------");

        String result = Stream.generate(() -> 1)
                .limit(4)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);

        //5. skip
        Stream<Integer> stream1 = Stream.generate(()->1).skip(10).limit(100);
        System.out.println(stream1.count());



    }
}
