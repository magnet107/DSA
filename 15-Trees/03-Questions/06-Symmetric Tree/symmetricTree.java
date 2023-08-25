//https://leetcode.com/problems/symmetric-tree/submissions/?envType=study-plan-v2&envId=top-interview-150
package binaryTree.Questions;

public class symmetricTree {
    public class TreeNode {
        int val;
        sameTree.TreeNode left;
        sameTree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, sameTree.TreeNode left, sameTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left,root.right);
    }

    private boolean helper(TreeNode left,TreeNode right)
    {
        if(left==null && right==null) return true;
        if(left!=null && right!=null && left.val==right.val)
        {
           return helper(left.left,right.right) && helper(left.right,right.left);
        }
        return false;
    }
}
