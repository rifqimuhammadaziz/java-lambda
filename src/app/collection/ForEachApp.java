package app.collection;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Rifqi", "Muhammad", "Aziz");

        // for loop
        for (var value : list) {
            System.out.println(value);
        }

        // forEach anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // forEach lambda
        list.forEach(value -> System.out.println(value));

        // forEach lambda method reference
        list.forEach(System.out::print);
    }
}
