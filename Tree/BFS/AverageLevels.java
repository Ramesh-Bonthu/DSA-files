package Tree.BFS;

import java.util.ArrayList;                                     
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevels {
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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

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

            Double sum = 0.0;

            for(int a : arr){
                sum += a;
            }

            Double value = sum /arr.size();

            ans.add(value);
        }

        return ans;
    }


}
