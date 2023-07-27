package Queue;

public class Main {
    public static void main(String[] args) {
        customQueue queue=new customQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.display();
        queue.remove();
        queue.display();
    }
}
