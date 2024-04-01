import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new LinkedHashSet<>();
        Set<Integer> z = new TreeSet<>();

        x.add(1);
        x.add(1);
        x.add(1);
        x.add(1);

        y.add(2);
        y.add(2);
        y.add(2);
        y.add(2);
        y.add(2);
        y.add(2);

        z.add(3);
        z.add(90);
        z.add(3);
        z.add(3);
        z.add(3);

        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
    }
}
