package Recursion;

// https://leetcode.com/problems/reverse-string/description/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString1(arr);

    }

    static void reverseString(char[] arr, int i, int j) {
        if (i >= j) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        char val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
        reverseString(arr, i + 1, j - 1);

    }
    static void reverseString1(char[] arr) {

        int j = arr.length -1;
        for(int i = 0; i < arr.length/2; i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
