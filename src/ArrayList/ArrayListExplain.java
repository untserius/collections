package ArrayList;

import java.util.*;

public class ArrayListExplain {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        al.add(0, 6);

        al.add(7);

        int sum = al.get(0) + al.get(6);
        System.out.println(sum);

        System.out.println(al);
    }
}
