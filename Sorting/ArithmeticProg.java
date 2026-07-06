package Sorting;

import java.util.Arrays;

public class ArithmeticProg {
    public static void main(String[] args) {
        int[] arr = {3,4,1};
        System.out.println(arithmeticProg(arr));
    }

    static boolean arithmeticProg(int[] arr){
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for(int i = 2; i < arr.length; i++){
            if (arr[i] - arr[i-1] != diff) {
                return false;
            }
        }
        
        return true;
    }
}

