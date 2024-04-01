package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> booklist = new ArrayList<>();

        Book b1 = new Book(1, 1998, "Java Programming", "Rajat Gupta");
        Book b2 = new Book(2, 2007, "Python Programming", "Saurav Das");
        Book b3 = new Book(3, 2017, "Introduction to AI", "Sudhir Das");

        booklist.add(b1);
        booklist.add(b2);
        booklist.add(b3);

        System.out.println(booklist);
        booklist.forEach( e -> {
            System.out.print(e.id + " ");
            System.out.print(e.year + " ");
            System.out.print(e.name+ " ");
            System.out.print(e.author+ " ");
            System.out.println("");
        });

        System.out.println("Size of the library is " + booklist.size());


    }

}

class Book {

    int id;
    String name;
    String author;
    int year;

    public Book(int id, int year, String name, String author){
        this.id = id;
        this.year = year;
        this.name = name;
        this.author = author;
    }
}