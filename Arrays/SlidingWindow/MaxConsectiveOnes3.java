package Arrays.SlidingWindow;

public class MaxConsectiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(maxConsectiveOnes31(nums, k)); 
    }
    static int maxConsectiveOnes3(int[] nums,int k){
        int count = 0;
        int ans = count;
        int val = k;
        int i = 0;
        int j =0;
        while (j < nums.length) {
            if (nums[j] == 1) {
                j++;
                count++;
            }else if (nums[j] == 0 && val > 0) {
                j++;
                count++;
                val--;
            }else{
                ans = Math.max(ans, count);
                count = 0;
                i++;
                j = i;
                val = k;
            }
        }
        return ans;
    }
    static int maxConsectiveOnes31(int[] nums,int k){
        int ZerosCount = 0;
        int ans = 0;
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            if (nums[r] == 0) {
                ZerosCount++;
            }

            while (ZerosCount > k) {
                if (nums[l] == 0) {
                    ZerosCount--;
                }
                l++;
            }

            ans = Math.max(ans, r-l+1);
        }
        
        
        return ans;
    }
}
