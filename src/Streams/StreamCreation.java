package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());

        //From Arrays
        String[] arrays={"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arrays);
        System.out.println(stream1.count());

        //Using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");
        System.out.println(stream2.count());

        //Infinite Stream
        Stream<Integer> stream3 = Stream.generate(()->1).limit(100);
        System.out.println(stream3.count());

        Stream<Integer> stream4 = Stream.iterate(1,x->x+1).limit(100);
        System.out.println(stream4.count());
    }
}
