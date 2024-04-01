package ArrayList;

public class RecursivePrint {
    public static void main(String[] args) {
        printNum(1, 100);
    }

    public static void printNum(int s, int e){

        if (s <= e){
            System.out.println(s);
            printNum(s+1, e);
        }
    }
}
