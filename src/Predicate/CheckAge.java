package Predicate;

import java.util.function.Predicate;

public class CheckAge {
    public static void main(String[] args) {

        Predicate<Integer> predicate = age -> age > 18;
        System.out.println(predicate.test(11));
    }
}
