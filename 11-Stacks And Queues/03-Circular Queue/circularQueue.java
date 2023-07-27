package Queue.circularQueue;

public class circularQueue {
     int front=0;
     int end=0;
     int size=0;
    protected int data[];
    private static final int DEFAULT_SIZE=10;
    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.data =new int[size];
    }
    public boolean add(int value)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }

    public boolean isFull() {
        return size==data.length;
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    private boolean isEmpty() {
        return size==0;
    }

    public void display()
    {
        int i=front;
        do {
            System.out.print(data[i++]+" ->");
        }
        while (i!=end);
        System.out.println(" END");
    }


}
