package Consumer;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        biConsumer.accept(10, "Rohit");
    }
}