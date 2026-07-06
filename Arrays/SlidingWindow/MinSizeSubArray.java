package Arrays.SlidingWindow;

public class MinSizeSubArray {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int l = 0;
        int sum = 0;
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];

            if (sum >= target) {
                min = Math.min(min, r - l + 1);
            }

            while (sum-target > 0) {
                sum -= nums[l];
                l++;
            }
            if (sum >= target) {
                min = Math.min(min, r - l + 1);
            }

            
        }

        if (min != nums.length) {
            return min;
        }

        
        return 0;
    }
    public static int minSubArrayLen1(int target, int[] nums) {
        for(int i=0;i<nums.length;i++){
            
        }
        return 1;
    }
}
