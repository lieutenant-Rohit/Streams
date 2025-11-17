package Streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Traditional Method to count even numbers in the list
        int count = 0;
        for(int i : numbers)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of Even Numbers:- "+count);

        System.out.println("----Counting Even Numbers via Streams----");
        System.out.println("Number of Even Numbers:- "+numbers.stream().filter(x->x%2==0).count());
    }
}
