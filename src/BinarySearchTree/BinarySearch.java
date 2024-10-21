package BinarySearchTree;

import java.util.Stack;

public class BinarySearch {
    private TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode (int data) {
            this.data = data;
        }
    }

    public void createBinaryTree () {
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

// Recursive way to find the preOrder


//    public void preOrder (TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }

    public void preOrder (TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push (root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    // recursive way to find the inOrder


//    public void inOrder (TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.data + " ");
//        inOrder(root.right);
//    }

    public void inOrder (TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrder (TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
//        bs.createBinaryTree();
//        bs.preOrder(bs.root);

        bs.createBinaryTree();
        bs.inOrder(bs.root);

//        bs.createBinaryTree();
//        bs.postOrder(bs.root);
    }
}
