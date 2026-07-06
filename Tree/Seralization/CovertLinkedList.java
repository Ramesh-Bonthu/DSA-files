package Tree.Seralization;

import java.util.ArrayList;

public class CovertLinkedList {

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
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flatten(root);
    }

    public static void flatten(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();

        preOrder(root, ans);

        System.out.println(ans);

        TreeNode node = new TreeNode();

        TreeNode node1 = node;

        for(int i = 0; i < ans.size(); i++){
            node.right = new TreeNode(ans.get(i));
            node.left = null;
            node = node.right;
        }

        root = node1.right;
    }


    public static void preOrder(TreeNode root, ArrayList<Integer> ans){
        if (root == null) {
            return;
        }
        
        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
}
