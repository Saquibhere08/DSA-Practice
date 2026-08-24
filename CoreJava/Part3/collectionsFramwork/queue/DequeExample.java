package CoreJava.Part3.collectionsFramwork.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        dq.addLast(40);

        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
