package Training.Day_10;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] mat = {{2, 1, 0, 2, 1}, {1, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
        System.out.println(orangesRot(mat));
    }   
    public static int orangesRot(int[][] mat) {
        // code here
        int ans = 0;
        Queue<int[]> q = new LinkedList<>();

        int total = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (!(mat[i][j] == 0)) {
                    total++;
                }
                if (mat[i][j] == 2) {
                    q.add(new int[]{i,j,0});
                }
            }
        }

        while (! q.isEmpty()) {
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            int t = curr[2];

            if(i-1 >= 0 && mat[i-1][j] == 1){
                q.add(new int[]{i-1,j,t+1});
                mat[i-1][j] = 3;
            }
            if(i+1 < n && mat[i+1][j] == 1){
                q.add(new int[]{i+1,j,t+1});
                mat[i+1][j] = 3;
            }
            if(j-1 >= 0 && mat[i][j-1] == 1){
                q.add(new int[]{i,j-1,t+1});
                mat[i][j-1] = 3;
            }
            if(j+1 < m && mat[i][j+1] == 1){
                q.add(new int[]{i,j+1,t+1});
                mat[i][j+1] = 3;
            }
            ans = Math.max(ans, t);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (mat[i][j] == 2 || mat[i][j] == 3) {
                    count++;
                }
            }
        }

        return total == count ? ans: -1;
    } 
}
