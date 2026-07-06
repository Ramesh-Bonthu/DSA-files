package Arrays;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(twoSum(arr, target));
    }
    static boolean twoSum(int[] arr, int target){
        
        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            int var = target - arr[i];
            if (hash.contains(var)) {
                return true;
            }
            hash.add(arr[i]);
        }
        
        return false;
    }
}
