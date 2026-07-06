package Greedy.Sorting;

import java.util.Arrays;

public class LargeNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};

        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for(int i =0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuffer sb = new StringBuffer();

        for(String s : arr){
            sb.append(s);
        }

        return sb.toString();
    }

    public static int countDigits(int num){
        return (int)(Math.log(num) /Math.log(10)) + 1;
    }
}
