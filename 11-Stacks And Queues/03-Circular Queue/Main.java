package Queue.circularQueue;

public class Main {
    public static void main(String[] args) {
        circularQueue q=new circularQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(47);
        q.add(5);
        q.display();
        q.remove();
        q.add(33);
        q.display();
    }
}
