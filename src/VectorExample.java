import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(10);
        v.add(100);
        v.add(120);
        v.add(200);

        System.out.println(v);

        for (int e : v){
            if (e > 100){
                System.out.println(e);
            }
        }

        Iterator<Integer> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
