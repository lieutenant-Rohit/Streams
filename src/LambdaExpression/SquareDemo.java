package LambdaExpression;

import java.util.function.Function;

public class SquareDemo {
    public static void main(String[] args) {

        Function<Integer,Integer> fun = n -> n*n;
        System.out.println(fun.apply(10));
    }
}
