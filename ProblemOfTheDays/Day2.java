package ProblemOfTheDays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Day2 {

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
    public static void main(String[] args) {
        
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        
        int n = descriptions.length;

        HashSet<Integer> par = new HashSet<>();
        HashSet<Integer> child = new HashSet<>();

        for(int i = 0; i < n; i++){
            par.add(descriptions[i][0]);
            child.add(descriptions[i][1]);
        }

        int rootval = 0;

        for(int val : par){
            if (!child.contains(val)) {
                rootval  = val;
                break;
            }
        }

        TreeNode root = new TreeNode(rootval);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            for(int i = 0; i < n; i++){
                if (node.val == descriptions[i][0]) {
                    
                    if (descriptions[i][2] == 1) {
                        node.left = new TreeNode(descriptions[i][1]);
                        q.add(node.left);
                    }else{
                        node.right = new TreeNode(descriptions[i][1]);
                        q.add(node.right);
                    }
                }
            }
        }

        return root;
    }


}
