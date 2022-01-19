package app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        // testScore(60, getName()); // eager parameter, always executed then send to parameter

        /**
         * Lazy Parameter
         * Executed function on parameter when is needed
         * getName() will not be executed if second parameter (name) is not needed
         */
        testScoreLambda(60, () -> getName());
    }

    public static void testScore(int score, String name) {
        if (score > 80) {
            System.out.println("Congratulation " + name + ", you passed test!");
        } else {
            // parameter name is not needed
            System.out.println("Try again next year!");
        }
    }

    public static void testScoreLambda(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Congratulation " + name.get() + ", you passed test!");
        } else {
            // parameter name is not needed
            System.out.println("Try again next year!");
        }
    }

    public static String getName() {
        System.out.println("Method getName() executed...");
        return "Rifqi Muhammad Aziz";
    }
}
