package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Rohit","Deepika","Karna");
        list.forEach(System.out::println);

        Function<String , Integer> fun = String :: length;
        System.out.println("Length of String is: " + fun.apply("Hello Java"));
    }
}
