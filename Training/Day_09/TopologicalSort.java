package Training.Day_09;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        int[][] edges ={
            {3, 0}, {1, 0}, {2, 0}
        };
        int v = 4;
        System.out.println(topoSort(v, edges)); 
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        boolean[] visit = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < V; i++){
            if (visit[i] == false) {
                dfs(adj, ans, i, st, visit);
            }
        }

        while (!st.empty()) {
            ans.add(st.pop());
        }
        
        return ans;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,int s,Stack<Integer> st,boolean[] visit){
        visit[s] = true;

        for(int val : adj.get(s)){
            if (visit[val] == false) {
                dfs(adj, ans, val, st, visit);
            }
        }

        st.push(s);
    }
}
