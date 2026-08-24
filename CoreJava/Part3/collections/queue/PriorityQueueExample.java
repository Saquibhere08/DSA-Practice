package CoreJava.Part3.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(6);
        pq.offer(40);
        pq.offer(2);
        pq.offer(55);
        pq.offer(4);
        pq.offer(8);
        pq.offer(50);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("PriorityQueue: " + pq.poll());

        System.out.println("Head: " + pq.peek());

        Iterator<Integer> i = pq.iterator();

        while (i.hasNext()) {
            System.out.println(pq.poll());
        }

    }
}
