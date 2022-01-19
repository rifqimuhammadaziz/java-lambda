package app;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalClassApp {
    public static void main(String[] args) {
        sayHello("xenosty");

        // null parameter will not be executed
        String name = null;
        sayHelloNullException(name);
    }

    // parameter cannot be null
    public static void sayHello(String name) {
        String nameUpper = name.toUpperCase();
        System.out.println("Hi, " + nameUpper);
    }

    // create simple null exception using lambda
    public static void sayHelloNullException(String name) {
        // if for checking parameter
//        if (name != null) {
//            String upperName = name.toUpperCase();
//            System.out.println("Hi " + upperName);
//        }

        // name parameter can be null
        // Optional<String> optionalName = Optional.ofNullable(name);

        // transform an object to another object
        // Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        // if parameter is exists, print out this
        // optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

        // lambda method reference (more simple)
        Optional.ofNullable(name) // nullable parameter
                .map(String::toUpperCase) // transform object to upperCase
                .ifPresentOrElse(
                        value -> System.out.println("Hi " + value), // printout if parameter is exists
                        () -> System.out.println("Hello, why don't you have a name?") // printout if parameter is null
                );

        // or using this to replace null parameter
        String upperName = Optional.ofNullable(name) // if name is exists
                .map(String::toUpperCase) // transform to uppercase
                .orElse("Friend?"); // if name is null, replace with string

        System.out.println("Hello " + upperName);
    }
}
