package Training.Day_09;

import java.util.ArrayList;

public class DetectCycleInUndirGraph {
    public static void main(String[] args) {
        
    }
    public boolean isCycle(int V, int[][] edges) {
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

        for(int i = 0; i < V; i++){
            if (visit[i] == false) {
                if (dfs(adj, i, visit, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visit,int parent){
        visit[s] = true;

        for(int val : adj.get(s)){
            if (visit[val] == true && val != parent) {
                return true;
            }
            if (visit[val] == false) {
                if(dfs(adj, val, visit, s)) return true;
            }
        }
        return false;
    }
}
