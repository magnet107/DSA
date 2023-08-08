package doublyLinkedList;

import CustomLinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        Custom dl=new Custom();
        dl.insertFirst(11);
        dl.insertFirst(12);
        dl.insertLast(10);
        dl.insertLast(33);
        dl.insertFirst(34);
        dl.insert(88,3);
//        dl.deleteFirst();
//        dl.deleteLast();
            dl.delete(4);
        dl.display();

    }
}
