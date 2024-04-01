package TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class A {
    public static void main(String[] args) {
        ArrayList<Integer> ts = new ArrayList<>();

        ts.add(45);
        ts.add(4);
        ts.add(15);
        ts.add(1);
        ts.add(34);
        ts.add(-2);
        System.out.println(ts);

        Collections.reverse(ts);


        System.out.println(ts);

        System.out.println(ts.size());
        System.out.println(ts.toArray().length);

    }


}
