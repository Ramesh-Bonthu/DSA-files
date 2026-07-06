package Training.Day_08;

import java.util.ArrayList;

public class Dfs {
    public static void main(String[] args) {
        int[][] adj = {
            {2, 3, 1}, {0}, {0, 4}, {0}, {2}
        };
        boolean[] visit = new boolean[adj.length];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(adj, 0, visit, ans);
        System.out.println(ans);
        
    }

    public static void dfs(int[][] adj,int s, boolean[] visit,ArrayList<Integer> ans){
        visit[s] = true;
        ans.add(s);

        for(int val: adj[s]){
            if (visit[val] == false) {
                dfs(adj, val, visit, ans);
            }
        }
    }
}
