package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalExample {
    public static void main(String[] args) {
        //Terminal Operation

        //1. Collect()
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenStream = list.stream().filter(x->x%2 == 0).collect(Collectors.toList());
        System.out.println(evenStream);

        //2. forEach()
//        list.stream().forEach(x-> System.out.println(x));

        //3. count()
        System.out.println(list.stream().count());

        //4. toArray()
        Integer[] arr = list.stream().toArray(Integer[]::new);
        for(Integer i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //5. Parallel Stream
        list.parallelStream().forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEachOrdered(System.out::print);

    }
}
