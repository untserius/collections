package Map;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComputeOps {
    public static void main(String[] args) {
        Map<Character, Integer> data = new HashMap<>();

        data.put('a', 0);
        data.put('b', 1);
        data.put('c', 2);
        data.put('d', 3);
        data.put('e', 4);
        data.put('f', 5);

        System.out.println("Original data : " + data);

        System.out.println("After");

        // compute()
        data.compute('c', (key, value) -> value == null ? 0 : value * 10);

        System.out.println(data);

        //computeIfPresent()

        data.computeIfPresent('d', (k, v) -> v * 100);

        System.out.println(data);

        data.compute('g', (k, v) -> v == null ? 1000 : v);

        System.out.println(data);

        Set<Character> set = data.keySet();

        System.out.println(set);

        Set<Map.Entry<Character, Integer>> newData = data.entrySet();

        System.out.println(newData);

//        Map<Character, Integer> data3 = (Map<Character, Integer>) data.clone();
    }
}
