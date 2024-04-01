package LinkedList;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(3);

        lhs.add("Neha");
        lhs.add("Ananya");
        lhs.add("Riya");
        lhs.add("Alisha");
        lhs.add(null);
        lhs.add(null);

        System.out.println(lhs);
    }
}
