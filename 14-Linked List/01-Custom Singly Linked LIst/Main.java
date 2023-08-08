package CustomLinkedList;


public class Main {
    public static void main(String[] args) {
        CustomLinkedList ll=new CustomLinkedList();
        ll.insertFirst(11);
        ll.insertFirst(10);
        ll.insertLast(12);
        ll.insertFirst(55);
        ll.insertFirst(43);
        ll.insertFirst(42);
        ll.insert(111,4);
//        ll.display();
        ll.deleteFirst();
//        ll.display();
        ll.deleteLast();
//        ll.display();
        ll.delete(2);
//        ll.display();
//        ll.find(10);
        ll.insertRec(99,3);
        ll.display();

    }
    }
