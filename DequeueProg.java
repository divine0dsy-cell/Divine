import java.util.*;
public class DequeueProg {
    public static void main(String args[]){
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(50);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println("after deletion:"+dq);

    }
}
