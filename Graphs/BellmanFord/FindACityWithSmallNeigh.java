package Graphs.BellmanFord;

public class FindACityWithSmallNeigh {
    public static void main(String[] args) {
        
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int city = -1;

        int[][] dist = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == j) {
                    dist[i][j] = 0;
                }else{
                    dist[i][j] = (int)(1e8);
                }
            }
        }

        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            int wt = it[2];

            dist[u][v] = wt;       
            dist[v][u] = wt;       
        }



        for(int via = 0; via < n; via++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][via] + dist[via][j]);
                }
            }
        }

        int maxReach = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if (dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }

            if (count <= maxReach) {
                maxReach = count;
                city = i;
            }

        }

        return city;
    }
}
