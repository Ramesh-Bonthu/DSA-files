// https://leetcode.com/problems/3sum-closest/description/

package Sorting;
import java.util.Arrays;


public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 1;
        threeSumClosest(arr, target);
    }
    static void threeSumClosest(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length - 1;
        int closeSum = arr[0] + arr[1] + arr[2];

        for(int i = 0; i <= n - 2; i++){

            int j = i+1;
            int k = n;
            while (j < k) {
                int curSum = arr[i] + arr[j] + arr[k];
                if (Math.abs(curSum -target) < Math.abs(closeSum - target)) {
                    closeSum = curSum;
                }
                
                if (curSum > target) {
                    k--;
                }else if(curSum < target){
                    j++;
                }else{
                    System.out.println(curSum);
                }
            }
        }
        System.out.println(closeSum);
    }
}
