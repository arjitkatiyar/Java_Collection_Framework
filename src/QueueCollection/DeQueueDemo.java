package QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueDemo {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(5);
        dq.add(4);
        dq.add(3);
        dq.add(6);
        dq.add(9);
        dq.add(7);

        System.out.println(dq.poll());
        System.out.println(dq);
    }
}
