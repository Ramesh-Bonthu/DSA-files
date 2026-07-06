package Graphs.FloydWarshall;

import java.util.ArrayList;

public class TransitiveClosure {
    public static void main(String[] args) {
        
    }

    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         
        for(int i = 0; i < N; i++){
            ans.add(new ArrayList<>());
        } 

        int INF = 100000000;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if (graph[i][j] == 0) {
                    graph[i][j] = INF;
                }
            }
        }
        

        for(int k = 0; k < N; k++){
            for(int  i =0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if (graph[i][j] != INF ) {
                    ans.get(i).add(1);
                }else{
                    ans.get(i).add(0);
                }
            }
        }


        return ans;
    }
}
