package Tree.DFS;

import java.util.ArrayList;
import java.util.List;


public class InorderTraversal {

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

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode();

        root.right = new TreeNode(2);

        root.right.left = new TreeNode(3); 

        System.out.println(inorderTraversal(root));
        
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inorderTraverse(root, ans);   
        
        return ans;
    }

    public static void inorderTraverse(TreeNode root,List<Integer> ans){

        if (root == null) {
            return;
        }

        inorderTraverse(root.left, ans);

        ans.add(root.val);

        inorderTraverse(root.right, ans);

    }
    
}
