package BinarySearchTrees.BSTOpertions;

public class DeleteBST {

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
        
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val == key) {
            root = root.right;
            return root;
        }

        if (root.val < key) {
            root.left = deleteNode(root.left, key);
        }else{
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    public static TreeNode searchNode(TreeNode root, int key){
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            return pickNode(root.right);
        }

        if (root.val < key) {
            return searchNode(root.left, key);
        }else{
            return searchNode(root.right, key);
        }

    }

    public static TreeNode pickNode(TreeNode root){
        if (root.left.left == null) {
            TreeNode node = root.left;
            root.left = null;
            return node;
        }else{
            return root;
        }
    }


}
