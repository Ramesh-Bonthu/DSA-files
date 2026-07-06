package Training.Day_08;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfProvinics {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(1, 1)));
        adj.add(new ArrayList<>(Arrays.asList(1, 1)));

        int n  = 2;
        System.out.println(noOfProvinics(adj, n));
    }
    public static int noOfProvinics(ArrayList<ArrayList<Integer>> adj, int n) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj1.add(new ArrayList<>());
        }

        for(int i = 0; i < adj.size(); i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                if (i != j && adj.get(i).get(j) == 1) {
                    int u = j;
                    adj1.get(i).add(u);
                }
            }
        }

        boolean[] visit = new boolean[n];
        for(int i = 0; i < n; i++){
            if (visit[i] == false) {
                dfs(adj1, visit, i);
                count++;
            }
        }
        return count;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj1,boolean[]  visit,int i){
        visit[i] = true;

        for(int j : adj1.get(i)){
            if (visit[j] == false) {
                dfs(adj1, visit, j);
            }
        }
    }
}
