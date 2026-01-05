package Arrays;

// https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch_04 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    System.out.println(setMismatch(arr));
  }

  static int[] setMismatch(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index + 1) {
        System.out.println(arr[index] + " " + (index + 1));
        return new int[] { arr[index], index + 1 };
      }
    }
    return new int[] { -1, -1 };
  }

  static void swap(int[] num1, int first, int second) {
    int temp = num1[first];
    num1[first] = num1[second];
    num1[second] = temp;
  }
}
