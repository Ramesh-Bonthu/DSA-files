package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,9,4};
        bubbleSort(arr, 0, 0);
    }

    static void bubbleSort(int[] arr, int i, int j){
        if(i == arr.length - 2){
            System.out.println(Arrays.toString(arr));
            return;
        }

        if (j == arr.length - i - 1) {
            bubbleSort(arr, i+1, 0);
            return;
        }

        if (arr[j] > arr[j+1]) {
            int swap = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = swap;
        }

        bubbleSort(arr, i, j+1);
    }
}
