package Graphs.UnionFind;

import java.util.Arrays;

public class MinimumSpanningTree {
    public static void main(String[] args) {
        int[][] arr = {
            {0,3,9},
            {1,4,2},
            {0,5,2},
            {1,3,5},
            {2,3,10}
        };

        int V = 6;

        System.out.println(spanningTree(V, arr));
    }

    public static int spanningTree(int V, int[][] edges) {

        int ans = 0;
        Arrays.sort(edges,(a,b) -> Integer.compare(a[2], b[2]));

        int[] parent = new int[V];
        int[] rank = new int[V];

        for(int i = 0; i < V; i++){
            parent[i] = i;
            rank[i] = 1;
        }

        for(int [] arr : edges){
            int a = arr[0];
            int b = arr[1];
            int w = arr[2];

            if(find(parent,a) != find(parent,b)){
                union(parent, a, b,rank);
                ans += w;
            }
        }
        
        return ans;
    }   

    public static void union(int[] parent, int a, int b,int[] rank){

        int pa = find(parent, a);
        int pb = find(parent, b);

        if(pa == pb) return;

        if(rank[pa] < rank[pb]){
            parent[pa] = pb;
        }else if(rank [pa] > rank[pb]){
            parent[pb] = pa;
        }else{
            parent[pb] = pa;
            rank[pa]++;
        }

    }

    public static int find(int[] parent, int a){

        if(parent[a] != a){
            parent[a] = find(parent, parent[a]);
        }

        return parent[a];
    }
}
