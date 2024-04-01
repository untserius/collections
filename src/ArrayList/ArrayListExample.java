package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Sudhir");
        al.add("Serius");
        al.add("Mike");
        al.add("Arun");
        al.add("Arun");

        Iterator<String> itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
