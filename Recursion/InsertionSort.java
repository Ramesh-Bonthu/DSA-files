package Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,9,6};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr){
        
        for(int i = 1; i < arr.length; i++){
            int j= i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
