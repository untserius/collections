package Queue;

import java.util.PriorityQueue;

public class Operations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            pq.add(i);
        }

//        System.out.println(pq.element());
//        System.out.println(pq.peek());
//
//        Iterator<Integer> itr = pq.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        pq.remove(); // remove the 1st element

        pq.poll(); // remove the 1st element

        pq.offer(34);
        System.out.println(pq);
    }
}
