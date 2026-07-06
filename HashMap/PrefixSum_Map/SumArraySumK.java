package HashMap.PrefixSum_Map;

import java.util.HashMap;

public class SumArraySumK {
    public static void main(String[] args) {
        int[] arr = {9, 4, 20, 3, 10, 5};
        int k = 33;
        System.out.println(cntSubarrays(arr, k));
        
    }
    public static int cntSubarrays(int[] arr, int k) {
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1); 
        
        int prefixSum = 0;

        for(int i = 0; i < arr.length; i++){

            prefixSum += arr[i];

            int target = prefixSum - k;

            if (map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }

        return count;
    }
}
