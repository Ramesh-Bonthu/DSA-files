package Tree.DFS;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    
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

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        postorderTraverse(root, ans);   
        
        return ans;
    }

    public static void postorderTraverse(TreeNode root,List<Integer> ans){

        if (root == null) {
            return;
        }

        postorderTraverse(root.left, ans);

        postorderTraverse(root.right, ans);

        ans.add(root.val);
    }
}
