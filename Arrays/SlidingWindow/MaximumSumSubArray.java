package Arrays.SlidingWindow;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        System.out.println(maximumSumSubArray(nums, k));
    }
    static double maximumSumSubArray(int[] nums,int k){
        double max = 0;
        double avg = 0;
        for(int i = 0; i < k; i++){
            max += nums[i];
        }
        avg = max;
        for(int i = 0; i < nums.length - k; i++){
            max -= nums[i];
            max += nums[i+k];
            if (max > avg) {
                avg = max;
            }
        }
        return avg/k;
    }
}
