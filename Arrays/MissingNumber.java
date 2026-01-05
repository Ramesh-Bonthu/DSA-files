package Arrays;

//https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    Sort(arr);
  }

  static void Sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    for (i = 0; i < arr.length; i++) {
      if (arr[i] != i) {
        System.out.println(i);
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] num1, int first, int second) {
    int temp = num1[first];
    num1[first] = num1[second];
    num1[second] = temp;
  }
}
