package Training.Day_12;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(solve(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        for(int i = 0; i < cost.length; i++){
            dp[i] = -1;
        }
        return Math.min(slove(cost, 0, dp),slove(cost, 1, dp));
    }

    public static int slove(int[] cost, int i, int[] dp){
        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int one = cost[i] + slove(cost, i+1, dp);
        int two = cost[i] +  slove(cost, i+2, dp);

        dp[i] = Math.min(one, two);

        return dp[i];
    }

    public static int solve(int[] cost){
        int[] dp = new int[cost.length];
        int n = cost.length;
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }

        return Math.min(dp[n-1],dp[n-2]);
    }
}
