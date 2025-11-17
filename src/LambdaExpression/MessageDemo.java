package LambdaExpression;

import java.util.function.Function;

public class MessageDemo {
    public static void main(String[] args) {

        Function<String,String> fun = String::toUpperCase;
        System.out.println(fun.apply("hello java"));
    }
}
