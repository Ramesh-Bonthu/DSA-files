package Tree.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

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
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);

        root.left.left = new TreeNode(15);

        root.left.right = new TreeNode(7);


        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int depth = 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        depth++;

        while (!q.isEmpty()) {
            
            int size = q.size();

            for(int i = 0; i < size; i++){

                TreeNode val = q.poll();

                if (val.left != null) {
                    q.offer(val.left);
                }

                if (val.right != null) {
                    q.offer(val.right);
                }

                if (val.left == null && val.right == null) {
                    return depth;
                }
                

            }

            depth++;
        }

        

        return depth;
    }
}
