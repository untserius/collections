package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Comparingbykey {
    public static void main(String[] args) {
        Map<Integer, String> register = new HashMap<>();

        register.put(0, "Sudhir");
        register.put(1, "Rahul");
        register.put(2, "Manish");
        register.put(3, "Yukti");
        register.put(4, "Sneha");
        register.put(5, "Karan");

        System.out.println(register);

        //Returns a Set view of the mappings contained in this map
        Set<Map.Entry<Integer, String>> r = register.entrySet();


        // comparingByKey
        r.stream().sorted(Map.Entry.comparingByKey()).forEach((e) -> {
            System.out.println(e);
        });

        System.out.println();

        // comparingByKey(Reverse Order)
        r.stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach((rev) -> {
            System.out.println(rev);
        });
    }
}
