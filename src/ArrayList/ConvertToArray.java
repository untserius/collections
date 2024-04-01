package ArrayList;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a);

        Object[] arr = a.toArray();

        System.out.println(arr);
    }
}
