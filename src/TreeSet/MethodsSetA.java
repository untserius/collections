package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MethodsSetA {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(23);
        ts.add(43);
        ts.add(3);
        ts.add(15);
        ts.add(56);
        ts.add(67);
        ts.add(7);
        ts.add(89);

        // ceiling - returns the next closest higher element.
        System.out.println(ts.ceiling(16));

        // floor - returns the next closest lower element
        System.out.println(ts.floor(50));


    }


}
