package app.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "Rifqi");
        map.put("B", "Bagas");
        map.put("C", "Kurnia");
        map.put("D", "Dimas");
        map.put("E", "Bayu");

        // for loop
        for (var data : map.entrySet()) {
            System.out.println(data.getKey() + " : " + data.getValue());
        }

        // forEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        // forEach lambda (more simple than using for loop and anonymous class)
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
