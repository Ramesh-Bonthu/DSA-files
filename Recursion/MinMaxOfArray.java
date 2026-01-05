package Recursion;
// https://www.geeksforgeeks.org/dsa/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
import java.util.Arrays;

public class MinMaxOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,5,9,-3};
        int[] res = new int[2];
        res[0] = arr[0];
        res[1] = arr[0];

        res = minMaxOfArray(arr, res, 1);
        System.out.println(Arrays.toString(res));
    }
    static int[] minMaxOfArray(int[] arr, int[] res, int i){
        if (i == arr.length) {
            return res;
        }
        if (arr[i] < res[0]) {
            res[0] = arr[i];
        }
        if (arr[i] > res[1]) {
            res[1] = arr[i];
        }
        return minMaxOfArray(arr, res, ++i);
    }
}
