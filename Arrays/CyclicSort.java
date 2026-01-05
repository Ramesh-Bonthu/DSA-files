package Arrays;
import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = { 9, 6, 4, 2, 3, 5, 7, 8, 1 };
    Sort(arr);
  }

  static void Sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
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
