package Arrays.PrefixSum;

import java.util.HashMap;

public class SubArraySumDivByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int pSum = 0;

        for(int i = 0; i < nums.length; i++){
            pSum += nums[i];

            int rem = pSum % k;
            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }


        return count;
    }
}
