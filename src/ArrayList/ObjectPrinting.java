package ArrayList;

import java.util.Arrays;

public class ObjectPrinting {
    public static void main(String[] args) {

        Object[] obj = {100, "Hello", "Hi", 400};
        obj[2] = new Item(300);
        obj[3] = new Item("Bye");

        System.out.println(Arrays.toString(obj));
    }
}

class Item {
    int x;
    String y;

    public Item(int x){
        this.x = x;
    }

    public Item(String y){
        this.y = null;
        this.x = 3148;
    }

    public String toString(){
        if (y != null) {
            return y;  // If y is not null, return y instead of x
        } else {
            return Integer.toString(x);
        }
    }
}
