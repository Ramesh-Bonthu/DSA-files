package Arrays.PrefixSum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,-1,4};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i= 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        int last = sum.length - 1; 

        if (sum[last] - sum[0] == 0) {
            return 0;
        }

        for(int i = 1; i < sum.length; i++){
            if (sum[i-1] == sum[last] - sum[i]) {
                return i;
            }
        }
        
        return -1;
    }
}
