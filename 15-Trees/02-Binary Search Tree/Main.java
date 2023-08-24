package binarySearchTree;

public class Main {
    public static void main(String[] args) {
            BST bst=new BST();
//            int[] nums={5,2,7,1,4,6,9,8,3,10};
//            bst.populate(nums);
//            bst.display();
            bst.populateSorted(new int[]{1,2,3,4,5,6,7,8,9,10});
            bst.display();
    }

}
