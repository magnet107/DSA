package Deque;

import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.Deque;

public class inbuiltExample {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.add(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
    }
}
