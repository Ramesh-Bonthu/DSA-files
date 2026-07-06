package Graphs.TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrerequisiteTasks {
    public static void main(String[] args) {
        int N = 4;
        int prerequisites[][] = {
            {1,0},
            {2,0},
            {3,1},
            {3,2}
        };

        int P = 3;

        System.out.println(isPossible(N, P, prerequisites));        
    }

    public static boolean isPossible(int N, int P, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[N];

        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < N; i++){
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int val = q.poll();
            ans.add(val);
            for(int i : adj.get(val)){
                indegree[i]--;

                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }

        if (ans.size() == N) return true;

        return false;
    }
}
