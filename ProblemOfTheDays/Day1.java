package ProblemOfTheDays;

import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};

        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] ls = new int[n];
        int[] rs = new int[n];

        ls[0] = 0;
        rs[n-1] = 0;

        int i = 1;
        int j = n - 2;

        while (i < n) {
            ls[i] = ls[i-1] + nums[i - 1];
            rs[j] = rs[j + 1] + nums[j + 1];
            
            i++;j--;
        }

        System.out.println(Arrays.toString(ls));
        System.out.println(Arrays.toString(rs));

        int[] ans = new int[n];

        for(i = 0; i < n; i++){
            ans[i] = Math.abs(ls[i] - rs[i]);
        }

        return ans;
    }
}
