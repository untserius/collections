package ArrayList;

import java.util.ArrayList;

public class IterationTesting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
