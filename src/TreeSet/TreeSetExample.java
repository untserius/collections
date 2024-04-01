package TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Hello");
        ts.add("My");
        ts.add("Name");
        ts.add("Is");
        ts.add("Serius");

        System.out.println(ts);
    }
}
