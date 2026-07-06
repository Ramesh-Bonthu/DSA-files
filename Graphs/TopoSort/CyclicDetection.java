package Graphs.TopoSort;

public class CyclicDetection {
    public static void main(String[] args) {
        int V = 6;
        int edges[][] = {
            {1,0},
            {2,1},
            {4,5},
            {5,4}
        };
        System.out.println(isCyclic(V, edges));
    }

    public static boolean isCyclic(int V, int[][] edges) {
        int[] parent = new int[V];

        for(int i = 0; i < V; i++){
            parent[i] = i;
        }

        for(int[] pre : edges){
            int a = pre[0];
            int b = pre[1];

            if (!union(parent, a, b)) {
                return false;
            }
        }

        return true;
    }

    public static boolean union(int[] parent, int a, int b){

        int pa = find(parent, a);
        int pb = find(parent, b);

        if (pa != pb) {
            parent[pb] = pa;
        }else{
            return false;
        }

        return true;
    }

    public static int find(int[] parent, int a){

        if (parent[a] == a) {
            return a;
        }

        return find(parent, parent[a]);
    }
}
