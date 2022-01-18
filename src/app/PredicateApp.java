package app;

import jdk.jshell.spi.SPIResolutionException;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        // basic testing blank parameter (with boolean return)
        Predicate<String> checkBlank = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };
        System.out.println(checkBlank.test("")); // isBlank true (empty string)
        System.out.println(checkBlank.test("testing value")); // isBlank false

        // lambda testing blank parameter (with boolean return)
        Predicate<String> checkBlank2 = value -> value.isBlank();
        System.out.println(checkBlank.test("")); // isBlank true (empty string)
        System.out.println(checkBlank.test("testing value")); // isBlank false

    }
}
