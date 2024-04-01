package TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortUsingTreeSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(3);

        System.out.println(list);

        TreeSet<Integer> tlist = new TreeSet<>();

        tlist.addAll(list);

        System.out.println(tlist);
    }
}
