package Tree.DFS;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

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

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        preorderTraverse(root, ans);   
        
        return ans;
    }

    public static void preorderTraverse(TreeNode root,List<Integer> ans){

        if (root == null) {
            return;
        }

        ans.add(root.val);

        preorderTraverse(root.left, ans);

        preorderTraverse(root.right, ans);

    }
}
