//https://leetcode.com/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150
package binaryTree.Questions;

public class pathSum {
    public class TreeNode {
        int val;
        maxDepth.TreeNode left;
        maxDepth.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, maxDepth.TreeNode left, maxDepth.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==targetSum)
        {
            return true;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

    }

}
