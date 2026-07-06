package Graphs.DFS;

import java.util.ArrayList;

public class NoOfComponents {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
            {0,1},
            {2,1},
            {3,4}
        };

        System.out.println(getComponents(V, edges));
    }
    public static ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visit = new boolean[V];

        for(int i =0; i < V; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            if (visit[i] == false) {
                dfs(adj, i, temp, visit);
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int sour, ArrayList<Integer> temp,boolean[] visit){
        visit[sour] = true;
        temp.add(sour);
        
        for(int s : adj.get(sour)){
            if (visit[s] == false) {
                dfs(adj, s, temp, visit);
            }
        }
    }
}
