package Arrays;
// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive_05 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 0 };
    System.out.println(firstMissingPositive(arr));
  }

  static int firstMissingPositive(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    for (i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1) {
        return i + 1;
      }
    }
    return -1;
  }

  static void swap(int[] num1, int first, int second) {
    int temp = num1[first];
    num1[first] = num1[second];
    num1[second] = temp;
  }
}
