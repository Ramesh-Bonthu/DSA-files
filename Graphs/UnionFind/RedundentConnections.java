package Graphs.UnionFind;

import java.util.Arrays;

public class RedundentConnections {
    public static void main(String[] args) {

        int[][] edges = {
            {1,2},
            {2,3},
            {3,4},
            {1,4},
            {1,5}
        };

        System.out.println(Arrays.toString(findRedundantConnection(edges)));
        
    }
    public static int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;

        int[] parent = new int[n + 1];

        for(int i = 0; i <= n; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];

            if (find(parent, a) != find(parent, b)) {
                union(parent, a, b);
            }else{
                return new int[]{a,b};
            }
        }

        return edges[n-1];
    }

    public static void union(int[] parent, int a, int b){
        int pa = find(parent, a);
        int pb = find(parent, b);

        if(pa != pb){
            parent[pb] = pa;
        }
    }

    public static int find(int[] parent, int a){
        if (parent[a] != a) {
            parent[a] = find(parent, parent[a]);
        }

        return parent[a];
    }
}
