package app;

import util.StringUtil;

import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        /**
         * Method reference
         * Parameter<> must be the same with method
         * Return value of object and method must be the same
         *
         * Return of Predicate is boolean, Return StringUtil.isLowerCase is boolean
         */

        // basic
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return StringUtil.isLowerCase(value);
            }
        };
        System.out.println(predicateIsLowerCase.test("xenosty")); // true : all letter is lowercase
        System.out.println(predicateIsLowerCase.test("Xenosty")); // false : contains uppercase

        // lambda (method reference with static method)
        Predicate<String> predicateIsLowerCase2 = StringUtil::isLowerCase;
        System.out.println(predicateIsLowerCase2.test("xenosty")); // true : all letter is lowercase
        System.out.println(predicateIsLowerCase2.test("Xenosty")); // false : contains uppercase

        // method reference in parameter
        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("xenosty"));
    }

    public void run() {
        // access non-static method in same file (this::isLowerCase; / app::isLowerCase;)
        Predicate<String> predicateIsLowerCase2 = this::isLowerCase;
        System.out.println(predicateIsLowerCase2.test("xenosty")); // true : all letter is lowercase
        System.out.println(predicateIsLowerCase2.test("Xenosty")); // false : contains uppercase
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        // access non-static method from other owner (this::isLowerCase; / app::isLowerCase;)
        Predicate<String> predicateIsLowerCase2 = app::isLowerCase;
        System.out.println(predicateIsLowerCase2.test("xenosty")); // true : all letter is lowercase
        System.out.println(predicateIsLowerCase2.test("Xenosty")); // false : contains uppercase
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
