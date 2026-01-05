package Arrays;
// https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    System.out.println(FindPeak(arr));
  }

  static int FindPeak(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
        return mid;
      } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
  /*
   * static int FindPeak(int[] arr) {
   * int start = 0;
   * int end = arr.length - 1;
   * if (arr.length == 1) {
   * return 0;
   * } else if (arr.length == 2) {
   * return peakOfTwo(arr, 0, 1);
   * } else {
   * while (start < end) {
   * int mid = start + (end - start) / 2;
   * if (mid - 1 > 0 && mid + 1 < arr.length) {
   * if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
   * return mid;
   * } else if (arr[mid - 1] > arr[mid + 1]) {
   * end = mid - 1;
   * } else {
   * start = mid + 1;
   * }
   * } else if (mid == 0) {
   * return peakOfTwo(arr, mid, mid + 1);
   * }
   * }
   * if (start == end) {
   * return start;
   * }
   * return -1;
   * }
   * }
   * 
   * static int peakOfTwo(int[] arr, int s, int e) {
   * if (arr[s] > arr[e]) {
   * return s;
   * } else {
   * return e;
   * }
   * }
   */
}
