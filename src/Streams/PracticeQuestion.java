package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeQuestion{
    public static void main(String[] args) {

        // Sort name whose length >= 6
        List<String> list = List.of("Deepika","Harhsita","Aman","Rohit","Yash");

        List<String> l1 = list.stream().filter(x -> x.length() >= 6).collect(Collectors.toList());

        System.out.println(l1);

        // Square and sum
        List<Integer> list1 = Arrays.asList(4,1,6,2,3,9,0);
        System.out.println(list1.stream().map(x->x*x).sorted().toList());

        //Sum of elements of list
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> result = integers.stream().reduce(Integer::sum);
        System.out.println(result.get());

        //Count Occurrence
        String st = "Hello World";
        System.out.println(st.chars().filter(x->x=='l').count()); //st.chars return int (Unicode)

    }
}
