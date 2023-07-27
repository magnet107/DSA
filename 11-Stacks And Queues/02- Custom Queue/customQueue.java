package Queue;

import java.util.Arrays;

public class customQueue {
    protected int data[];
    private static final int DEFAULT_SIZE=10;
    int pointer=0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data =new int[size];
    }
    public boolean add(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        data[pointer]=value;
        pointer++;
        return true;
    }

    private boolean isFull() {
        return pointer==data.length-1;
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
        }
        int removed=data[0];
        for (int i=1;i<pointer;i++)
        {
            data[i-1]=data[i];
        }
        pointer--;
        return removed;
    }

    private boolean isEmpty() {
        return pointer==0;
    }

    public void display()
    {
        for (int i=0;i<pointer;i++)
        {
            System.out.print(data[i]+" ->");
        }
        System.out.println(" END");
    }
}
