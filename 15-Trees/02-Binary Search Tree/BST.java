package binarySearchTree;

public class BST {
    private class Node
    {
        private int value;
        private Node left;
        private Node right;
        private int height;
        Node(int value)
        {
            this.value=value;
        }
    }
    private Node root;
    public BST()
    {

    }
    public int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty()
    {
        return root==null;
    }
    public void insert(int value)
    {
        root=insert(value,root);
    }
    private Node insert(int value,Node node)
    {
        if(node==null)
        {
            node=new Node(value);
            return node;
        }
        if(value<node.value)
        {
            node.left=insert(value,node.left);
        }
        if(value>node.value)
        {
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void populate(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums)
    {
        populateSorted(nums,0,nums.length-1);
    }

    private void populateSorted(int[] nums,int s,int e)
    {
        if(s>=e) return;

        int mid=(s+e)/2;
        this.insert(nums[mid]);
        populateSorted(nums,0,mid);
        populateSorted(nums,mid+1,e);

    }

    public boolean isBalanced()
    {
        return isBalanced(root);
    }
    private boolean isBalanced(Node node)
    {
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <=1  && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display()
    {
        display(this.root,"Root node : ");
    }

    private void display(Node node,String details)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"left child of "+ node.value+" : ");
        display(node.right,"right child of "+node.value+" : ");
    }
}
