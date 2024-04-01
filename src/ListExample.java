import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Character> v = new Vector<>();
        List<Double> s = new Stack<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);


        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        v.add('e');

        s.add(12.45);
        s.add(14.1);
        s.add(0.45);
        s.add(44512.87);
        s.add(512.45);
        s.add(51.55);

        System.out.println(al);
        System.out.println(v);
        System.out.println(s);
    }
}
