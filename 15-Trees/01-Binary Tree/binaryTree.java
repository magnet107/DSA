package binaryTree;

import java.util.Scanner;

public class binaryTree {

    private class Node
    {
        int value;
        Node left;
        Node right;
        public Node(int value)
        {
            this.value=value;
        }
    }
    private Node root;

    public void populate(Scanner scanner)
    {
        System.out.println("enter the root node: ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add left of "+node.value);
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter value for left node: ");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to add right of "+node.value);
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter value for right node: ");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display()
    {
        display(root,"");
        prettyDisplay(root,0);
    }
    private void display(Node node,String ind)
    {
        if(node==null) return;
        System.out.println(ind+node.value);
        display(node.left,ind+"\t");
        display(node.right,ind+"\t");
    }
    public void prettyDisplay(Node node,int level)
    {
        if(node==null) return;
        prettyDisplay(node.right,level+1);
        if(level!=0)
        {
            for (int i=0;i<level-1;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+node.value);
        }
        else
        {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public void preOrder()
    {
        preOrder(root);
    }
    private void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder()
    {
        inOrder(root);
    }
    private void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    private void postOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
}
