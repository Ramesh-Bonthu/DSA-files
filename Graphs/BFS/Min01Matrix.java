package Graphs.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Min01Matrix {
    public static void main(String[] args) {
        int[][] mat = {
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };

        mat = updateMatrix(mat);

        for(int[] m : mat){
            System.out.println(Arrays.toString(m));
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (mat[i][j] == 1) {
                    q.add(new int[]{i,j});
                }else{
                    mat[i][j] = -1;
                }
            }
        }


        while (!q.isEmpty()) {
            int[] li = q.poll();
            int i = li[0];
            int j = li[1];

            if (i - 1 >= 0 && mat[i-1][j] == -1) {
                mat[i-1][j] = mat[i][j] + 1;
                q.add(new int[]{i-1,j});   
            }

            if (i + 1 < n && mat[i+1][j] == -1) {
                mat[i+1][j] = mat[i][j] + 1;
                q.add(new int[]{i+1,j});   
            }

            if (j + 1 < m && mat[i][j+1] == -1) {
                mat[i][j + 1] = mat[i][j] + 1;
                q.add(new int[]{i,j + 1});    
            }

            if (j - 1 >= 0 && mat[i][j - 1] == -1) {
                mat[i][j - 1] = mat[i][j] + 1;
                q.add(new int[]{i,j-1});    
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < m; j++){
                li.add(mat[i][j]);
            }

            ans.add(li);
        }

        return mat;
    }

    public static int[][] updateMatrix1(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                dp[i][j] = 1;
            }
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 0) {
                    dfs(mat, i, j, 1,dp);
                }
            }
        }

        return mat;
    }

    public static void dfs(int[][] mat, int i, int j,int val,int[][] dp){

        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != 0) {
            return;
        }

        if (dp[i][j] == -1) {
            return;
        }

        mat[i][j] = Math.min(mat[i][j], val);

        dp[i][j] = -1;
        dfs(mat, i, j -1, val + 1,dp);
        dfs(mat, i, j + 1, val + 1,dp);
        dfs(mat, i-1, j, val + 1,dp);
        dfs(mat, i+1, j, val + 1,dp);
        dp[i][j] = 1;
    }
}
