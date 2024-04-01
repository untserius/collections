package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ops2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map.put(1, "Victor");
        map.put(2, "Stacy");
        map.put(3, "Mike");

        map2.put(4, "Victor");
        map2.put(5, "Maria");
        map2.put(6, "Puerto");

        System.out.println(map);

        map.putIfAbsent(7, "Victoria");

        System.out.println(map);

        map.merge(8, "Drian", (String::concat));
        map.merge(3, "Drake", (String::concat));

        System.out.println(map);

        map2.replace(5, "Paulo");

        System.out.println(map2);

        Collection<String> val = map.values();

        System.out.println(val);
    }
}
