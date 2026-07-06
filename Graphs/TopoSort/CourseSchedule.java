package Graphs.TopoSort;

public class CourseSchedule {
    
    public static void main(String[] args) {
        int N = 6;
        int prerequisites[][] = {
            {1,0},
            {2,1},
            {4,5},
            {5,4}
        };

        System.out.println(canFinish(N, prerequisites));
    }

    public static boolean canFinish(int N, int[][] prerequisites) {
        
        int[] parent = new int[N];

        for(int i = 0; i < N; i++){
            parent[i] = i;
        }

        for(int[] pre : prerequisites){
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
