import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionIntoAnotherCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(15);
        list1.add(10);
        list1.add(7);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);

        System.out.println(list2);

        // After adding

        list2.addAll(2,list1);

        System.out.println(list2);
    }
}
