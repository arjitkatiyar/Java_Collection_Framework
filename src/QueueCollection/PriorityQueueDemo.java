package QueueCollection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

       PriorityQueue<String> pq = new PriorityQueue<>();    //Comparator.reverseOrder() can be used as parameter to set max heap
       pq.offer("arjit");
       pq.offer("Arpit");
       pq.offer("Anuj");
       pq.offer("Arjit");
       pq.offer("aryan");
        System.out.println(pq); // priority queue shows elements in mainly shorted order as min Heap.

        System.out.println(pq.poll()); //it will remove the elements which have high priority
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
