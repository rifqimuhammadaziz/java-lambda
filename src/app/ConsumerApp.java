package app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        // basic
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };
        consumer.accept("Xenosty");

        // lambda
        Consumer<String> consumerLambda = value -> System.out.println(value);
        consumer.accept("Xenosty");
    }
}
