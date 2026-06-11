import java.util.*;
public class QueueProg {
    public static void main(String args[]){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(30);
        pq.add(50);
        pq.add(10);
        pq.add(40);
        System.out.println(pq);
        System.out.println("removed element:" + pq.poll());
        System.out.println("head element:" + pq.peek());

    }
}
