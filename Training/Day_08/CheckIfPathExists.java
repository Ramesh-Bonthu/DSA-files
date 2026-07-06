package Training.Day_08;
import java.util.ArrayList;

public class CheckIfPathExists {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
            {0,1},{1,2},{2,0}
        };
        int source = 0;
        int destination = 2;
        System.out.println(validPath(n, edges, source, destination));
    }   
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
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

        dfs(adj, visit, source);

        return visit[destination];
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visit, int val){
        visit[val] = true;

        for(int i : adj.get(val)){
            if (visit[i] == false) {
                dfs(adj, visit, i);
            }
        }
    }
}
