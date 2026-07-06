package DynamicProgramming.DPon2D;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {
            {1,2,3},{4,5,6}
        };

        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                dp[i][j] = -1;
            }
        }
        
        /*ArrayList<Integer> ans = new ArrayList<>();
        dfs(grid, 0, 0, 0, n - 1, m -1, ans);

        int min = Integer.MAX_VALUE;
        for(int i : ans){
            min = Math.min(min, i);
        }*/

        int res =  dfs(grid, 0, 0, n - 1, m - 1, dp);

        for(int[] arr : dp){
            System.out.println(Arrays.toString(arr));
        }

        return res;
    }

    public static void dfs(int[][] grid,int sum, int r, int c, int re, int ce, ArrayList<Integer> ans){
        if (r == re && c == ce) {
            sum += grid[r][c];
            ans.add(sum);
            return;
        }

        if (r >= grid.length || c >= grid[0].length) {
            return;
        }

        sum += grid[r][c];

        dfs(grid, sum, r + 1, c, re, ce, ans);
        dfs(grid, sum, r, c + 1, re, ce, ans);


    }

    public static int dfs(int[][] grid, int r, int c, int re, int ce,int[][] dp){
        if (r >= grid.length || c >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        
        if (r == re && c == ce) {
            return grid[r][c];
        }

        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int left = dfs(grid, r + 1, c, re, ce, dp);
        int right = dfs(grid, r, c + 1, re, ce, dp);

        return dp[r][c] = grid[r][c] + Math.min(left, right);

    }


}
