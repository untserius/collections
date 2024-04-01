package ArrayList;

public class Prime {
    public static void main(String[] args) {

        int n = 89363648;

        System.out.println(checker(n));
    }

    public static boolean checker(int x){

        // edge case
        if (x <= 1){
            return false;
        }

        for (int i = 2; i * i< x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
