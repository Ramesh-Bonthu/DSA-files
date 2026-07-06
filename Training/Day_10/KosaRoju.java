package Training.Day_10;

import java.util.ArrayList;
import java.util.Stack;

public class KosaRoju {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0, 2}, {0, 3}, {1, 0}, {2, 1}, {3, 4}};
        System.out.println(kosaraju(V, edges));
    }
    public static int kosaraju(int V, int[][] edges) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        boolean[] visit = new boolean[V];
        for(int i = 0; i < V; i++){
            if (visit[i] == false) {
                topoSort(adj, i, st, visit);
            }
        }
        System.out.println(st);
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            g.add(new ArrayList<>());
        }
        
        for(int u = 0; u < V; u++) {
            for(int v : adj.get(u)) {
                g.get(v).add(u);
            }
        }


        for(int i = 0; i < V; i++){
            visit[i] = false;
        }

        while (!st.empty()) {
            int node = st.pop();

            if (visit[node] == false) {
                dfs(g, node, visit);
                count++;
            }
        }


        return count;
    }

    public static void topoSort(ArrayList<ArrayList<Integer>> adj,int s,Stack<Integer> st, boolean[] visit){
        visit[s] = true;

        for(int i : adj.get(s)){
            if (visit[i] == false) {
                topoSort(adj, i, st, visit);
            }
        }
        st.push(s);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> g,int s, boolean[] visit){
        visit[s] = true;
        for(int i : g.get(s)){
            if (visit[i] == false) {
                dfs(g, i, visit);
            }
        }
    }
}
