package QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(5);     // off used to add elements.
        dq.offerFirst(4);
        dq.offerLast(3); // it has default method to add elements at last.
        dq.offer(6);
        dq.offer(9);
        dq.offer(7);

        System.out.println(dq);

        System.out.println(dq.poll());  //poll used to remove element from queue also print the element on console.
        System.out.println(dq.pollLast());
        System.out.println(dq); //in queue element removed from front and added from rear.
        System.out.println(dq.peekLast());
    }
}
