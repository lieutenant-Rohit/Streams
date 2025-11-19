package ParallelStream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        List<Long> list = Stream.iterate(1L, x -> x + 1)
                .limit(30000)   // use smaller limit to avoid overflow
                .toList();

        List<Long> result = list.stream()
                .map(ParallelStreamDemo::factorial)
                .toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken By Sequential Stream: " + (endTime - startTime) + " ms");


        long sTime = System.currentTimeMillis();
        List<Long> pList = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        long eTime = System.currentTimeMillis();
        System.out.println("Time Taken By Sequential Stream: " + (eTime - sTime) + " ms");
    }

    private static long factorial(long n) {
        long result = 1;
        for (long i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}