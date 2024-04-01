package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Exception {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

//        s1.setName("Serius");
//        s1.setRoll(1);
//
//        s2.setName("Rajat");
//        s2.setRoll(2);

        TreeSet<Student> students = new TreeSet<Student>();

        students.add(s1);
        students.add(s2);

        System.out.println(students);

        for (Object s : students){
            System.out.println(s);
        }
    }
}

class Student  {
    int roll;
    String name;

    // getter
    public int getRoll(int roll){
        return this.roll;
    }

    public String getName(String name){
        return this.name;
    }

    // setters

    public void setRoll(int roll){
        this.roll = roll;
    }

    public void setName(String name){
        this.name = name;
    }

//    @Override
//    public int compareTo(Student obj){
//        return Integer.compare(this.roll, obj.roll);
//    }
//
//    public String toString(){
//        return roll + " " + name;
//    }
}
