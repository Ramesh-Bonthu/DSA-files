package BinarySearchTrees.BSTOpertions;

public class InsertIntoBST {

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

    public TreeNode insertBST(TreeNode root, int val) {

        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }

        if (root.val > val) {
            root.left =  insertBST(root.left, val);
        }else{
            root.right =  insertBST(root.right, val);
        }

        return root;
    }

}
