package CustomLinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size=0;
    }

    public void insertFirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }

        size++;
    }
    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value,int index)
    {
        if(index==0)
        {
            insertFirst(value);
            return;
        }
        if(index==size)
        {
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public void insertRec(int value,int index)
    {
        head=insertRec(value, index, head);

    }
    private Node insertRec(int value,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(value,node);
            size++;
            return temp;
        }
        node.next=insertRec(value,index-1,node.next);
        return node;
    }
    public int deleteFirst()
    {
        int value=head.value;
        head=head.next;
        size--;
        if(head==null)
        {
            tail=null;
        }
        return value;
    }

    public Node get(int index)
    {
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }

        return temp;
    }
    public int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();

        }
        int value= tail.value;
        Node temp=get(size-2);
        tail=temp;
        tail.next=null;
        size--;
        return value;
    }
    public int delete(int index)
    {
        if(index==0)
        {
            return deleteFirst();

        }
        if(index==size-1)
        {
            return deleteLast();
        }
        Node prev=get(index-1);
        int value= prev.next.value;
        prev.next=prev.next.next;
        return value;
    }

    public Node find(int value)
    {
        Node node=head;
        while (node!=null)
        {
            if(node.next.value==value)
            {
                return node;
            }
            node.next=node;
        }
        return null;
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node
    {
        private int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }

     public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
 }
}
