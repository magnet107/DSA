package circularLinkedList;

public class Main {
    public static void main(String[] args) {
        Custom cll=new Custom();
        cll.insert(11);
        cll.insert(12);
        cll.insert(13);
        cll.display();
        cll.delete(12);
        cll.display();

    }
}
