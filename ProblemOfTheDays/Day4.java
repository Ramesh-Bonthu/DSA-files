package ProblemOfTheDays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Day4 {
    public static void main(String[] args) {
        
    }

    public int assignEdgeWeights(int[][] edges) {
        
        int n = edges.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <=  n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] arr : edges){
            int u = arr[0];
            int v = arr[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n + 1];

        vis[0] = true;
        vis[1] = true;

        Queue<Integer> q = new LinkedList<>();

        int depth = 0;

        q.add(1);

        while (!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++){
                int val = q.poll();

                for(int ele : adj.get(val)){
                    if (vis[ele] == false) {
                        q.add(ele);
                        vis[ele] = true;
                    }
                }
            }

            depth++;
        }


        return (int) Math.pow(2, depth - 1);
    }
}
