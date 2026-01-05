package Arrays;
// https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1767466401/

public class SingleElementinSortArray {
  public static void main(String[] args) {
    int[] arr = { 3, 3, 7, 10, 10, 11, 11, 12, 12 };
    System.out.println(SingleElement(arr));
  }

  static int SingleElement(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    if (start == end) {
      return arr[0];
    } else if (arr[start] != arr[start + 1]) {
      return arr[0];
    } else if (arr[end] != arr[end - 1]) {
      return arr[end];
    } else {
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid % 2 != 0) {
          mid -= 1;
        }
        if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
          return arr[mid];
        } else if (arr[mid] == arr[mid + 1]) {
          start = mid + 2;
        } else {
          end = mid;
        }
      }
    }

    return 0;
  }
}
/*
 * if (arr.length % 4 == 1) {
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * int i = mid % 2 == 0 ? 0 : 1;
 * if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
 * return arr[mid];
 * } else if (i == 0 && arr[mid] == arr[mid + 1]) {
 * start = mid;
 * } else {
 * end = mid;
 * }
 * }
 * } else {
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * int i = mid % 2 == 0 ? 0 : 1;
 * if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
 * return arr[mid];
 * } else if (i == 1 && arr[mid] == arr[mid - 1]) {
 * start = mid + 1;
 * } else {
 * end = mid;
 * }
 * }
 * }
 */