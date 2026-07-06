package Training.Day_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCyeleinDirGraph {
    public static void main(String[] args) {
        int[][] edges ={
            {3, 0}, {4, 2}, {1, 2}
        };
        int v = 5;
        System.out.println(isCyclic(v, edges));
    }
    public static boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        System.out.println(adj);

        int[] indeg = new int[V];

        for(int i = 0; i < adj.size(); i++){
            for(int u : adj.get(i)){
                indeg[u]++;
            }
        }
        System.out.println(Arrays.toString(indeg));
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++){
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        System.out.println(q);

        while(!q.isEmpty()){
            int val = q.peek();
            q.poll();
            ans.add(val);
            for(int v : adj.get(val)){
                indeg[v]--;
                if (indeg[v] == 0) {
                    q.add(v);
                }
            }
        }
        System.out.println(ans);

        if (ans.size() < V) {
            return true;
        }
        
        return false;    
    }
}
