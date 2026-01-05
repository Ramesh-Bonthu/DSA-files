package Arrays;
import java.util.Arrays;

public class MergeArrays {
  public static void main(String[] args) {
    int[] num1 = { 1, 2, 3, 0, 0, 0 };
    int[] num2 = { 2, 5, 6 };
    int m = 3;
    int n = 3;
    if (m == 0) {
      System.out.println(Arrays.toString(num2));
    } else if (n == 0) {
      System.out.println(Arrays.toString(num1));
    } else {
      mergeArrays(num1, num2, m);
      insertion(num1);
    }

    // System.out.println(Arrays.toString(num1));
  }

  static void mergeArrays(int[] num1, int[] num2, int m) {
    int j = 0;
    for (int i = m; i < num1.length; i++, j++) {
      num1[i] = num2[j];
    }
  }

  static void insertion(int[] num1) {
    for (int i = 0; i < num1.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (num1[j] < num1[j - 1]) {
          swap(num1, j, j - 1);
        } else {
          break;
        }
      }
    }
    System.out.println(Arrays.toString(num1));
  }

  static void swap(int[] num1, int first, int second) {
    int temp = num1[first];
    num1[first] = num1[second];
    num1[second] = temp;
  }
}
