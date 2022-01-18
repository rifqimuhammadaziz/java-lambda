package app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        // basic get function (with String return)
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Xenosty";
            }
        };
        System.out.println(supplier.get());

        // lambda get function (with String return)
        Supplier<String> supplier2 = () -> "Xenosty";
        System.out.println(supplier2.get());
    }
}
