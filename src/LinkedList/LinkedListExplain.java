package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedListExplain {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();


        ll.add("Sudhir");
        ll.add("Saurav");
        ll.add("Rajat");
        ll.add("Rahul");
        ll.add("Sonu");

        ll.addFirst("Pankaj");


        ll.add(0, "Nikhil");
        int x = 5000;

        ll.set(4, String.valueOf(x));

        ll.set(1, ll.get(1).toString().toUpperCase());
        ll.set(3, ll.get(3).toString().toUpperCase());

        System.out.println(ll);

    }
}
