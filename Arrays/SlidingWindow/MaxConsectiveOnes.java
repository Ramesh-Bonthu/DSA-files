package Arrays.SlidingWindow;

public class MaxConsectiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxConsectiveOnes(nums));
    }
    static int maxConsectiveOnes(int[] nums){
        int count = 0;
        int ans = count;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                count++;
            }else{
                if (count > ans) {
                    ans = count;
                }
                count = 0;
            }
        }
        if (count > ans) {
            ans = count;
        }

        return ans;
    }
}
