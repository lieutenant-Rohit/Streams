package Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x%2==0;
        boolean res = predicate.test(4);
        System.out.println(res);
    }
}
