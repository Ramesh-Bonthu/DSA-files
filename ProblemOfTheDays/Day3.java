package ProblemOfTheDays;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>  left = new ArrayList<>();
        ArrayList<Integer>  right = new ArrayList<>();
        int count = 0;

        for(int num : nums){
            if (num < pivot) {
                left.add(num);
            }else if (num > pivot) {
                right.add(num);
            }else{
                count++;
            }
        }

        int  i = 0;

        for(int val : left){
            nums[i++] = val;
        }

        while(count != 0){
            nums[i++] = pivot;
            count--;
        }

        for(int val : right){
            nums[i++] = val;
        }

        return nums;

    }
}
