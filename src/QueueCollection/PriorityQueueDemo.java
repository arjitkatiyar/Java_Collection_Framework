package QueueCollection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Z");
        queue.add("B");
        queue.add("C");
        queue.add("F");
        queue.add("E");

//        Iterator<String> itr = queue.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        for(String x: queue) {
//            System.out.println(x);
//        }

        System.out.println(queue.size());


    }
}
