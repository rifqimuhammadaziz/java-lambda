package app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        // basic function length of string (with Integer return)
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        System.out.println(functionLength.apply("Xenosty"));

        // lambda function length of string (with Integer return)
        Function<String, Integer> functionLengthUsingLambda = value -> value.length();
        System.out.println(functionLength.apply("Xenosty"));
    }
}
