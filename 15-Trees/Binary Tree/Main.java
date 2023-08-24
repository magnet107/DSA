package binaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        binaryTree bt=new binaryTree();
        bt.populate(scanner);
        bt.display();
    }
}
