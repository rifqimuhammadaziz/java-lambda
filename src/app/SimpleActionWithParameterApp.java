package app;

import lambda.SimpleAction;
import lambda.SimpleActionWithParameter;

public class SimpleActionWithParameterApp {
    public static void main(String[] args) {
        // Anonymous class
        SimpleActionWithParameter simpleAction1 = new SimpleActionWithParameter() {
            @Override
            public String action(String name) {
                return "Hi, " + name;
            }
        };
        System.out.println(simpleAction1.action("Xenosty"));

        // Lambda with parameter
        SimpleActionWithParameter simpleAction2 = (String name) -> {
            return "Hello, " + name;
        };
        System.out.println(simpleAction2.action("Xenosty"));

        // Lambda with different parameter with String type
        SimpleActionWithParameter simpleAction3 = (value) -> {
            return "Hello, " + value;
        };
        System.out.println(simpleAction3.action("Xenosty"));

        // Lambda without return keyword
        SimpleActionWithParameter simpleAction4 = (String value) -> "Hai, " + value;
        System.out.println(simpleAction4.action("One Line"));

        // Lambda without return keyword
        SimpleActionWithParameter simpleAction5 = (value) -> "Hai, " + value;
        System.out.println(simpleAction5.action("One Line"));

        // Lambda without return keyword
        SimpleActionWithParameter simpleAction6 = value -> "Hai, " + value;
        System.out.println(simpleAction6.action("One Line"));
    }
}
