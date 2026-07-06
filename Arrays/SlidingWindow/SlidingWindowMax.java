package Arrays.SlidingWindow;

import java.util.Arrays;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(slidingWindowMax(nums, k)));
        
    }
    static int[] slidingWindowMax(int[] nums, int k){
        
        int[] ans = new int[nums.length - k + 1];
        
        
        for(int i = 0; i < nums.length - k+1; i++){
            int max = nums[i];
            for(int j = i; j < i+k; j++){
                max = Math.max(max, nums[j]);
            }

            ans[i] = max;
        }

        return ans;
    }
}
