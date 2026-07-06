package Graphs.DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraImp {
    public static void main(String[] args) {

        int V = 3;
        int[][] edges = {
            {0,1,1},
            {1,2,3},
            {0,2,6}
        };

        int src = 2;
        System.out.println(Arrays.toString(dijkstra(V, edges, src)));
    }
    public static int[] dijkstra(int V, int[][] edges, int src) {
        // code here

        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            int w = edge[2];

            adj.get(a).add(new ArrayList<>(Arrays.asList(b,w)));
            adj.get(b).add(new ArrayList<>(Arrays.asList(a,w)));
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) ->  a[0] - b[0]
        );

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        pq.add(new int[]{0,src});

        while(!pq.isEmpty()){
            int[] top = pq.poll();

            int d = top[0];
            int u = top[1];

            if (d > dist[u]) {
                continue;
            }

            for(ArrayList<Integer> p : adj.get(u)){
                int v = p.get(0);
                int w = p.get(1);

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{dist[v],v});
                }
            }
        }

        System.out.println(Arrays.toString(dist));
        return dist;
        
    }
}
