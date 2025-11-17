package LambdaExpression;

import java.util.function.Function;

public class LengthOfString {
    public static void main(String[] args) {
        Function<String,Integer> fun = String::length;
        System.out.println("Length is:- " + fun.apply("Hello"));
    }
}
