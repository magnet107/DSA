package doublyLinkedList;

import javax.sound.midi.Soundbank;

public class Custom {
    private Node head;
    private Node tail;
    private int size;

    public Custom() {
        this.size=0;
    }

    public void insertFirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        node.prev = null;
        if(head!=null) {
            head.prev=node;
        }
        head=node;
        size++;
    }

    public Node get(int index)
    {
        Node temp=head;
        for (int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;

    }

    public void insertLast(int value)
    {
        if(head==null)
        {
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        Node last=get(size);
        node.next=null;
        last.next=node;
        node.prev=last;

        size++;
    }

    public void insert(int value,int index)
    {
        if(index==0)
        {
            insertFirst(value);
            return;
        }
        if(index==size-1)
        {
            insertLast(value);
            return;
        }
        Node node=new Node(value);
        Node previous=get(index);
        node.next=previous.next;
        previous.next=node;
        node.prev=previous;
        if(node.next!=null)
        {
            node.next.prev=node;
        }

        size++;
    }

    public void deleteFirst()
    {
        head=head.next;
        head.prev=null;
        size--;
    }
    public void deleteLast()
    {
        Node previous=get(size-1);
        tail=previous;
        tail.next=null;
        size--;
    }

    public void delete(int index)
    {
        Node previous=get(index-1);
        previous.next=previous.next.next;
        previous.next.prev=previous;
        size--;
    }
    public void display()
    {
        Node node=head;
        Node last=null;
        System.out.print("START ");
        while (node!=null)
        {
            last=node;
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.println("END");

        System.out.print(" END");

        while (last!=null)
        {
            System.out.print(last.value+" -> ");
            last=last.prev;
        }
        System.out.println("START");

    }


    private  class Node
    {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
