package Recursion;

import java.util.Arrays;

public class SumTriangeArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] num1 = sumTriangeArray(num);
        System.out.println(Arrays.toString(num1));   
    }

    static int[] sumTriangeArray(int[] num){
        if (num.length == 1) {
            return num;
        }
        int[] arr = new int[num.length-1];
        for(int i = 0; i < num.length-1; i++){
            arr[i] = num[i] + num[i+1];
        }
        return sumTriangeArray(arr);
    }
}