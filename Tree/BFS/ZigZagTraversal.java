package Tree.BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        boolean val = false;

        while (!q.isEmpty()) {
            
            int size = q.size();

            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode node = q.poll();

                arr.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (val) {
                Collections.reverse(arr);
                ans.add(arr);
                val = !val;
            }else{
                ans.add(arr);
                val = !val;
            }
        }

        return ans;
    }
}
