package Arrays;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class FindMinInRotateSortArr {
  public static void main(String[] args) {
    // int[] arr = { 1 };
    // System.out.println(FindMin(arr));

    int a = 10;
    if ((a & 1) == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }

  static int FindMin(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    if (arr[start] < arr[end]) {
      return arr[start];
    } else {
      while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[end]) {
          start = mid + 1;
        } else if (arr[mid] < arr[end]) {
          end = mid;
        } else {
          end--;
        }
      }
      return arr[end];
    }
  }
}
