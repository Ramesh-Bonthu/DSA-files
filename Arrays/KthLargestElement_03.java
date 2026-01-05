package Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/1725328342/

public class KthLargestElement_03 {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 5, 6, 4 };
    int k = 2;
    KthLarge(arr, k);
  }

  static void KthLarge(int[] arr, int k) {
    Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
    int var = arr.length - k;
    System.out.println(arr[var]);
  }
}
