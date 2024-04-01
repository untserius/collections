package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ops3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();


        map.put(0, "Hello");
        map.put(1, "Hi");
        map.put(2, "Bye");


        Map<Integer, String> map2 = new HashMap<>();

        Set<Map.Entry<Integer, String>> copy = map.entrySet();

//        for (int i = 0; i <= map.size() - 1; i++){
//            map2.put(new Integer())
//        }

        System.out.println(map);
        System.out.println(map2);

        for (Map.Entry<Integer, String> e : copy){
            map2.put(e.getKey(), e.getValue());
        }
        System.out.println(map2);
//        Map<Integer, String> map2 = (Map<Integer, String>) map.clone();

//        System.out.println(map);
//        System.out.println(map2);

        System.out.println(map.equals(map2));
    }
}
