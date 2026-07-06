package Graphs.BellmanFord;

import java.util.Arrays;

public class NegitaveWeightCycle {
    public static void main(String[] args) {
        int[][] edges = {
            {1,0,5},
            {1,2,-2},
            {1,4,6},
            {2,3,3},
            {3,1,-4}
        };
        
        int n = 5;

        System.out.println(isNegativeWeightCycle(n, edges));
    }

    public static int isNegativeWeightCycle(int n, int[][] edges) {

        if(n == 1){
            return 0;
        }
        
        int[] dist = new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[edges[0][0]] = 0;
        
        for(int i = 0; i < n - 1; i++){
            for(int[] it : edges){
                int u = it[0];
                int v = it[1];
                int wt = it[2];
                
                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }

        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            int wt = it[2];
            
            if(dist[u] != Integer.MAX_VALUE &&dist[u] + wt < dist[v]){
                return 1;
            }
        }

        return 0;
        
    }
}
