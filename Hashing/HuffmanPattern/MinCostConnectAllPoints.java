package Hashing.HuffmanPattern;

import java.util.PriorityQueue;

public class MinCostConnectAllPoints {
    public static void main(String[] args) {

        int[][] points = {{0,0},{1,1},{1,0},{-1,1}};
        
        System.out.println(minCostConnectPoints(points));
    }

    public static int minCostConnectPoints(int[][] points) {
        int cost = 0;
        int n = points.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> { return a[2] - b[2];}
        );

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int dist = Math.abs(points[j][0] - points[i][0]) + Math.abs(points[j][1] - points[i][1]);

                pq.add(new int[]{i,j,dist});
            }
        }

        int[] par = new int[n];

        for(int i = 0; i < n; i++){
            par[i] = i;
        }

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int a = curr[0];
            int b = curr[1];
            int wt = curr[2];

            if (find(par, a) != find(par, b)) {
                union(par, a, b);

                cost += wt;
            }
        }
        

        return cost;
    }

    public static void union(int[] par, int a, int b){
        int pa = find(par, a);
        int pb = find(par, b);

        if (pa != pb) {
            par[pb] = pa;
        }
    }

    public static int find(int[] par, int i){

        if (par[i] == i) {
            return i;
        }

        return find(par, par[i]);

    } 
}
