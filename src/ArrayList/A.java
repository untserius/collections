package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class A {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

//        Iterator<Integer> itr = l.iterator();

//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        ListIterator<Integer> itr2 = l.iterator();


        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l2.add(60);
    }
}
