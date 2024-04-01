package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomTreeSet {
    public static void main(String[] args) {
        // Created a custom comaparator for descending order
        TreeSet<Integer> ts = new TreeSet<>(new DescendingComparator());

        ts.add(45);
        ts.add(4);
        ts.add(15);
        ts.add(1);
        ts.add(34);
        ts.add(-2);

        System.out.println(ts);

        // Retrieving the the comparator used by the TreeSet
        Comparator<? super Integer> comparator = ts.comparator();
        if (comparator != null){
            System.out.println(comparator);
        } else {
            System.out.println("Natural order");
        }
    }
}

// Custom comparator
class DescendingComparator implements Comparator<Integer>{

    // To compare in descending order
    @Override
    public int compare(Integer one, Integer two){
        return Integer.compare(two, one);
    }
}
