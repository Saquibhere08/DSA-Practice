package CoreJava.Part3.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // offer()
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println("Queue: " + q);

        // element()
        System.out.println("Head of Queue: " + q.element());

        // poll()
        System.out.println("Head: " + q.poll());
        System.out.println("Queue: " + q);

        // peek()
        System.out.println("Head: " + q.peek());

    }
}
