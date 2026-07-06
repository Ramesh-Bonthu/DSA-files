package Training.Day_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println(adj);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj){
        int v = adj.size();
        boolean[] visit = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visit[0] = true;

        while (!queue.isEmpty()) {
            int val = queue.poll();
            ans.add(val);
            for(int n : adj.get(val)){
                if (visit[n] == false) {
                    queue.add(n);
                    visit[n] = true;
                }
            }
        }

    }
}
