package LinkedList;

import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();

        List<Integer> i2 = Arrays.asList(6, 7, 8, 9, 10);

        ArrayList<Integer> he = new ArrayList<>();

        System.out.println();


        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);

        // To add all the elements of i2 list at once.
        i.addAll(i2);

        // To remove
        i.remove(4);

        // reverse traversing
        Iterator o = i.descendingIterator();
        while(o.hasNext()){
            System.out.println(o.next());
        }

        System.out.println(i);
    }
}
