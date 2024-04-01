package MethodReference;

import java.util.ArrayList;

public class DoubleEachElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(test(list));


    }

    public static ArrayList<Integer> test (ArrayList<Integer> list){

        list.replaceAll(DoubleEachElement :: getSquare);

//        for (int i = 0; i < list.toArray().length - 1; i++) {
//            list.set(i, list.get(i) * list.get(i));
//        }

        return list;
    }

    public static int getSquare(int x){
        return x * x;
    }
}
