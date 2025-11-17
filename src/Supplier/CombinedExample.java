package Supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CombinedExample {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x->x%2 == 0;
        Function<Integer,Integer> fun = x -> 2*x;
        Consumer<Integer> consumer = System.out::println;
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(fun.apply(supplier.get()));
        }
    }
}
