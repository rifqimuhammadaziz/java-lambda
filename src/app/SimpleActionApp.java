package app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // Anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Simple Action 1";
            }
        };
        System.out.println(simpleAction1.action());

        // Lambda (simple of anonymous class)
        SimpleAction simpleAction2 = () -> {
            return "Simple Action 2";
        };
        System.out.println(simpleAction2.action());
    }
}
