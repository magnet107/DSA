package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class inbuiltExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        Queue<Integer> queue1=new LinkedList<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add(14);
        System.out.println(queue);
        queue1.add(20);
        queue1.add(21);
        queue1.add(22);
        queue1.add(23);
        System.out.println(queue1);
        queue1.remove();
        System.out.println(queue1);
        queue1.add(24);
        System.out.println(queue1);
        System.out.println(queue.peek());
        System.out.println(queue1.peek());

    }
}
