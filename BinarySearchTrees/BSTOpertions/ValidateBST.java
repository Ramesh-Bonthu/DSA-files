package BinarySearchTrees.BSTOpertions;

import java.util.ArrayList;

public class ValidateBST {

    public static class TreeNode {
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
    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);

        root.left = new TreeNode(-1);

        System.out.println(isValidBST(root));
    }

    static int prevVal = Integer.MIN_VALUE;

    public static boolean isValidBST(TreeNode root) {
        
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }

        if (prevVal > root.val) {
            return false;
        }

        prevVal = root.val;

        if (!isValidBST(root.right)) {
            return false;
        }
        
        return true;
    }

    public static boolean isValidBSTOp(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();

        inOrder(root, arr);

        for(int i = 1; i < arr.size(); i++){
            if (arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void inOrder(TreeNode node, ArrayList<Integer> arr){
        if (node == null) {
            return;
        }

        inOrder(node.left, arr);
        arr.add(node.val);
        inOrder(node.right, arr);
    }
}
