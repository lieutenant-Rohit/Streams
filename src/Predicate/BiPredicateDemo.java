package Predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y)%2==0;
        System.out.println("Is Sum of 2 and 2 is EVEN :- " + isSumEven.test(2,2));
    }
}
