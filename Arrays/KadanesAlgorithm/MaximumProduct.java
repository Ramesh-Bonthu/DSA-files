package Arrays.KadanesAlgorithm;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,2,3,-5,-2};
        System.out.println(maxProduct1(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxprod = nums[0];
        int minprod = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int temp = maxprod;
            maxprod = Math.max(nums[i],Math.max(maxprod*nums[i], minprod*nums[i]));
            minprod = Math.min(nums[i],Math.min(temp*nums[i], minprod*nums[i]));

            result = Math.max(maxprod, result);
        }

        return result;
    }

    public static int maxProduct1(int[] nums) {
        int pre = 1;
        int suf = 1;
        int result  = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;

            pre *= nums[i];
            suf *= nums[nums.length - i - 1];

            result = Math.max(result, Math.max(pre, suf)); 
        }

        return result;
    }
}
