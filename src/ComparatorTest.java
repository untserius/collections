import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, "Mike");
        Employee e2 = new Employee(30, "Alexander");        Employee e3 = new Employee(31, "Alice");
        Employee e4 = new Employee(27, "Tressa");
        Employee e5 = new Employee(25, "V");
        Employee e6 = new Employee(22, "Nik");

        ArrayList<Employee> elist = new ArrayList<>();

        elist.add(e1);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        elist.add(e5);
        elist.add(e6);

        Collections.sort(elist, new NameLength());

        for (Employee e : elist){
            System.out.println(e);
        }
    }
}

class Employee {
    int age;
    String name;

    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}

class NameLength implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.name.length(), e2.name.length());
    }
}
