package Graphs.UnionFind;

import java.util.ArrayList;

public class NoOfCompleteNodes {
    public static void main(String[] args) {
        
    }

    int edgesCount;
    int nodes;

    public int countCompleteComponents(int n, int[][] edges) {
        int complete = 0;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visit = new boolean[n];
        
        for(int i = 0; i < n; i++){

            edgesCount = 0;
            nodes = 0;

            if (visit[i] == false) {
                dfs(adj, visit, i);

                edgesCount /= 2;

                if (edgesCount == nodes * (nodes - 1)/2) {
                    complete++;
                }

            }
        }

        return complete;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[]  visit,int i){
        visit[i] = true;
        
        nodes++;

        edgesCount += adj.get(i).size();

        for(int j : adj.get(i)){
            if (visit[j] == false) {
                dfs(adj, visit, j);
            }
        }
    }
}
