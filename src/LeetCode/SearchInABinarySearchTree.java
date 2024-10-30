package LeetCode;

public class SearchInABinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode (int val) {
            this.val = val;
        }
    }

    public void createBST (){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void preOrder (TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.val) {
            return searchBST (root.right, val);
        } else if (val < root.val) {
            return searchBST (root.left, val);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {

        SearchInABinarySearchTree sbst = new SearchInABinarySearchTree();
        sbst.createBST();
        sbst.preOrder(sbst.root);
        sbst.searchBST(sbst.root, 2);
        sbst.createBST();
    }
}
