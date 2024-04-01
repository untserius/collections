package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class InsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(1);
        h.add(34);
        h.add(21);
        h.add(12);
        h.add(3);
        h.add(9);

        for (int i = 0; i <= h.size() - 1; i++){
            System.out.println(i);
        }

        LinkedHashSet<Integer> l = new LinkedHashSet<>();

        l.add(34);
        l.add(4);
        l.add(23);
        l.add(10);
        l.add(1);

        for (int i = 0; i <= l.size() - 1; i++){
            System.out.println();
        }

        ArrayList<Integer> al = new ArrayList<>();

        al.add(34);
        al.add(4);
        al.add(23);
        al.add(10);
        al.add(1);

        for (int i = 0; i <= al.size() - 1; i++){
            System.out.println(i);
        }
    }
}
