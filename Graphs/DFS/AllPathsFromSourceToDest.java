package Graphs.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToDest {
    public static void main(String[] args) {

        /*int[][] graph = {
            {4,3,1},
            {3,2,4},
            {3},
            {4},
            {}
        };
*/
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(4,3,1)));
        adj.add(new ArrayList<>(Arrays.asList(3,2,4)));
        adj.add(new ArrayList<>(Arrays.asList(3)));
        adj.add(new ArrayList<>(Arrays.asList(4)));
        adj.add(new ArrayList<>(Arrays.asList()));

        System.out.println(countPaths(5, adj, 0, 4));
        
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();

        int sour = 0;
        int dest = graph.length - 1;

        List<Integer> temp = new ArrayList<>();
        temp.add(0);

        dfs(graph, sour, dest, temp, ans);

        return ans;

    }

    public static int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                          int destination) {

        return dfs(adj, source, destination);
    }

    public static int dfs(ArrayList<ArrayList<Integer>> adj, int sour, int dest){
        if (sour == dest) {
            return 1;
        }
        
        int count = 0;

        for(int s: adj.get(sour)){
            count += dfs(adj, s, dest);
        }
        
        return count;
    }

    public static void dfs(int[][] grid, int sour, int dest, List<Integer> temp,List<List<Integer>> ans){
        if (sour == dest) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int s: grid[sour]){
            temp.add(s);
            dfs(grid, s, dest, temp, ans);
            temp.remove(temp.indexOf(s));
        }
    }
}
