package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(45);
        a.add(42);
        a.add(23);
        a.add(1);
        a.add(12);
        a.add(56);
        a.add(13);

        Collections.sort(a);

//        System.out.println(a);

        a.forEach(System.out::println);
    }
}
