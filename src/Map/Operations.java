package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Operations {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        map.put(2, 2);
        map.put(1, 3);
        map.put(3, 4);
        map.put(4, 5);

        System.out.println(map);

        // Converting a map to set for traversing.

        // New convention
        Set<Map.Entry<Integer, Integer>> smap = map.entrySet();

        // Old convention
//        Set smap = map.entrySet();

        for (Map.Entry<Integer, Integer> e : smap){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
