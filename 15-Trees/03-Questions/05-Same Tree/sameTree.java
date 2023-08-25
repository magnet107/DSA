//https://leetcode.com/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150
package binaryTree.Questions;

public class sameTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
  }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null && q==null) return true;
       if(p==null ||q==null || p.val!=q.val) return false;
       return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
