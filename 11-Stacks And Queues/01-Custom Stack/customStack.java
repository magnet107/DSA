package Stack;

import java.util.Arrays;

public class customStack {
       protected int[] data;
       private static final int DEFAULT_SIZE=10;
        int pointer=-1;

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full!");
            return false;
        }
        pointer++;
        data[pointer]=item;
        return true;
    }

    public boolean isFull() {
        return data.length-1==pointer;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        int removed=data[pointer];
        pointer--;
        return removed;
    }

    public boolean isEmpty() {
        return pointer==-1;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return data[pointer];
    }

    @Override
    public String toString() {
        return "customStack{" +
                "data=" + Arrays.toString(data) +
                ", pointer=" + pointer +
                '}';
    }
}
