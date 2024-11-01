package LeetCode;

public class MaxDepthOfTheBinaryTree {

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

    // Here the code for the max depth of the binary tree

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = 1 + maxDepth (root.left);
        int right = 1 + maxDepth (root.right);
        return Math.max(left, right);
    }

    public static void main(String[] args) {

    }
}
