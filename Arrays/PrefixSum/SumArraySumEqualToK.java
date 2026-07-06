package Arrays.PrefixSum;

import java.util.HashMap;

public class SumArraySumEqualToK {
    public static void main(String[] args) {

        int[] nums = {3,4,7,2,-3,1,4,2};
        int k = 7;
        System.out.println(subarraySum(nums, k));
        
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum =0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        hash.put(0,1);

        for(int num: nums){
            sum += num;

            if (hash.containsKey(sum - k)) {
                count += hash.get(sum-k);
            }

            hash.put(sum, hash.getOrDefault(sum, 0) + 1);

        }


        return count;
    }
}
