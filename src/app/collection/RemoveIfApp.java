package app.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        // mutable list
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Rifqi", "Muhammad", "Aziz"));

        // removeIf anonymous class
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        // removeIf lambda (best practices)
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
