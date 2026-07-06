package Graphs.DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ChepestFlightsWithK {
    public static void main(String[] args) {
        int[][] flights = {
            {0,1,5},
            {1,2,5},
            {1,4,1},
            {4,2,1},
            {0,3,2},
            {3,1,2}
        };
        
        int n = 5;

        int src = 0;
        int dst = 2;
        int k = 2;

        System.out.println(findCheapestPrice1(n, flights, src, dst, k));
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] flight : flights){
            int s = flight[0];
            int d = flight[1];
            int c = flight[2];
            
            adj.get(s).add(new int[]{c,d});
        }

        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        dist[src] = 0;

        pq.add(new int[]{dist[src],src,k});

        while (!pq.isEmpty()) {
            int[] arr = pq.poll();

            int dista = arr[0];
            int node = arr[1];
            int inK = arr[2];

            if (inK < 0) {
                continue;
            }

            for(int[] a : adj.get(node)){
                int edgeWeight = a[0];
                int adjNode = a[1];

                if (dista + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dista + edgeWeight;
                    pq.add(new int[]{dist[adjNode],adjNode,inK - 1});
                }
            }

        }
        System.out.println(Arrays.toString(dist));
        return dist[dst] != Integer.MAX_VALUE ? dist[dst] : -1;
    }

    public static int findCheapestPrice1(int n, int[][] flights, int src, int dst, int k) {

        // Adjacency List
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] flight : flights) {

            int u = flight[0];
            int v = flight[1];
            int wt = flight[2];

            adj.get(u).add(new int[]{v, wt});
        }

        /*
            dist[node][stops]
            =
            minimum cost to reach 'node'
            using exactly 'stops' edges
         */

        int[][] dist = new int[n][k + 2];

        for(int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Min Heap -> {cost, node, stops}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[1] - b[1]);

        dist[src][0] = 0;

        pq.add(new int[]{src, 0, 0});

        while(!pq.isEmpty()) {

            int[] curr = pq.poll();

            int node = curr[0];
            int cost = curr[1];
            int stops = curr[2];

            // Destination reached
            if(node == dst) {
                return cost;
            }

            // Cannot take more than k stops
            if(stops > k) {
                continue;
            }

            for(int[] nei : adj.get(node)) {

                int adjNode = nei[0];
                int edgeWeight = nei[1];

                int newCost = cost + edgeWeight;

                /*
                    stops + 1
                    because we are taking one more edge
                 */

                if(newCost < dist[adjNode][stops + 1]) {

                    dist[adjNode][stops + 1] = newCost;

                    pq.add(new int[]{
                            adjNode,
                            newCost,
                            stops + 1
                });
                }
            }
        }

        return -1;
    }
}
