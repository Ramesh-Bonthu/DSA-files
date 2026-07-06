package Arrays.SlidingWindow;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {

        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(subArrayProductLessThanK1(nums, k));
        
    }

    static int subArrayProductLessThanK(int[] nums, int k){
        int count = 0;

        int l = 0;
        int r = 0;
        int product = 1;
        
        while(l < nums.length){
            if (r == nums.length) {
                product = 1;
                l++;
                r = l;
            }else{
                product *= nums[r];
                if (product < k) {
                    r++;
                    count += 1;
                }else{
                    product = 1;
                    l++;
                    r = l;
                }
            }
        }
        


        return count;
    }
    static int subArrayProductLessThanK1(int[] nums, int k){
        if (k <= 1) {
            return 0;
        }
        int count = 0;

        int l = 0;
        int product = 1;

        for(int r = 0; r < nums.length; r++){
            product *= nums[r];
            while (product >= k) {
                product /= nums[l];
                l++;
            }
            count += r-l+1;
        }
        
        
        return count;
    }
}
