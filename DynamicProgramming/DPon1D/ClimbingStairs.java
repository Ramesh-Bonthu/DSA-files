package DynamicProgramming.DPon1D;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(countWays(n));
    }

    public static int countWays(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }

        int left = countWays(n - 1);
        int right = countWays(n - 2);

        return left + right;
        
    }

    public static int countWays(int n, int[] dp) {
        
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int left = countWays(n - 1,dp);
        int right = countWays(n - 2,dp);

        return dp[n] = left + right;
        
    }
}
