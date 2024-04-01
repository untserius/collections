package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Mesho");
        ll.add("Myntra");
        ll.add("Paytm");
        ll.add("PhonePe");

        System.out.println(ll);

        Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
