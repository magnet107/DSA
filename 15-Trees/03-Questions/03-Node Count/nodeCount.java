//https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=study-plan-v2&envId=top-interview-150
package binaryTree.Questions;

public class nodeCount {
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

    public int countNodes(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + helper(node.left) + helper(node.right);
    }

    public static void main(String[] args) {
        nodeCount n = new nodeCount();

        // Creating nodes and building the binary tree
        TreeNode root = n.new TreeNode(1);
        root.left = n.new TreeNode(2);
        root.right = n.new TreeNode(3);
        root.left.left = n.new TreeNode(4);
        root.left.right = n.new TreeNode(5);
        root.right.left = n.new TreeNode(6);

        // Now you can use the `countNodes` method to count the nodes in the binary tree
        int nodeCount = n.countNodes(root);
        System.out.println("Total nodes in the binary tree: " + nodeCount);
    }
}
