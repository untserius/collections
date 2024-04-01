package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOps {
    public static void main(String[] args) {
        Deque<Character> de = new ArrayDeque<>();

        for (int i = 97; i < 123; i++) {
            de.add((char) i);
        }

        System.out.println("Original : " + de);

        de.peekFirst();
        de.peek();

        de.offerFirst('d');
        de.offerLast('y');

        de.pollFirst();

        System.out.println(de.pop());

        System.out.println("Modified : " + de);

    }
}
