package TreeSet;

import java.util.*;

public class NavigableDescendingSet {
    public static void main(String[] args) {

        // NavigableSet descendingSet()
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(2);
        set.add(23);
        set.add(12);
        set.add(4);
        set.add(9);
        set.add(10);
        set.add(-2);

        System.out.println("set : " + set);

        NavigableSet<Integer> navigableSet = set.descendingSet();

        System.out.println("navigableSet : " + navigableSet);

        // SortedSet headSet(E toElement)
        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(1);
        ss.add(7);
        ss.add(2);
        ss.add(6);
        ss.add(3);
        ss.add(5);
        ss.add(4);

        System.out.println("ss : " + ss);
        SortedSet<Integer> headSet = ss.headSet(6);
        SortedSet<Integer> subSet = ss.subSet(1, 4);
        SortedSet<Integer> tailSet = ss.tailSet(5);

        System.out.println("sortedSet : " + headSet);
        System.out.println("subset : "+subSet);
        System.out.println("tailSet : "+tailSet);

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(23);
        ts.add(2);
        ts.add(34);
        ts.add(4);
        ts.add(5);
        ts.add(10);

        System.out.println("ts : " + ts);

        ts.pollFirst();
        ts.pollLast();

        System.out.println("modified poll ts : " + ts);

        System.out.println(ts.descendingSet());
        // parseInt example
        String x = "100";
        int y = Integer.parseInt(x);

        System.out.println(y);

        Spliterator<Integer> s = ts.spliterator();

        s.forEachRemaining( e -> System.out.println(e));

        int charec = s.characteristics();
        System.out.println(charec);
    }
}
