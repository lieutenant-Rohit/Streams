package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> print = x -> {
            for (int i : x)
            {
                System.out.println(i);
            }
        };
        print.accept(list);
    }
}
