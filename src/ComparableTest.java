import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

//        Comparator.comparingInt();
        p2.setAge(20);
        p2.setName("Manish");

        p1.setAge(10);
        p1.setName("Rahul");

        p3.setAge(25);
        p3.setName("Ajay");

        p4.setAge(30);
        p4.setName("Tushar");

        p5.setAge(23);
        p5.setName("Vikrant");

        ArrayList<Person> list = new ArrayList<>();
        list.add(p2);
        list.add(p1);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        // Before sorting

//        for (Person p : list){
//            System.out.println(p);
//        }

        // After sorting based on their age (in descending order)

        Collections.sort(list);
        for (Person p : list){
            System.out.println(p);
        }


    }
}

class Person implements Comparable<Person>{
    int age;
    String name;

    // getters

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    // setters

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person p){
        return Integer.compare(p.age, this.age);
    }

    @Override
    public String toString(){
        return age + " " + name;
    }
}
