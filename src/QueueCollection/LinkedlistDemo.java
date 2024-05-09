package QueueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistDemo {       //Linked list used as queue as well as list
    public static void main(String[] args) {
      Queue<Integer> queue = new LinkedList<>();
        queue.offer(3); // off used to add elements.
        queue.offer(6);
        queue.offer(9);
        queue.offer(12);
        queue.offer(15);

        System.out.println(queue);

        System.out.println(queue.poll()); //poll used to remove element from queue also print the element on console.
        System.out.println(queue);  //in queue element removed from front and added from rear.
        System.out.println("size of queue : " + queue.size());
        System.out.println(queue.peek());

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(4);
        queue1.offer(8);
        queue1.offer(12);
        queue1.offer(16);
        System.out.println(queue1);

        queue.addAll(queue1);
        System.out.println(queue);

    }
}
