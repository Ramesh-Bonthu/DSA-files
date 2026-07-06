package Training.Day_08;

import java.util.ArrayList;

public class CountCompleteComponents {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
            {0,1},{0,2},{1,2},{3,4}
        };
        System.out.println(countCompleteComponents(n, edges));
    }
    public static int countCompleteComponents(int n, int[][] edges) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visit = new boolean[n];
        for(int i = 0; i < n; i++){
            if (visit[i] == false) {
                dfs(adj, visit, i);
                count++;
            }
        }
        return count;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[]  visit,int i){
        visit[i] = true;

        for(int j : adj.get(i)){
            if (visit[j] == false) {
                dfs(adj, visit, j);
            }
        }
    }
}
