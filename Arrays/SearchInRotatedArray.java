package Arrays;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/ 

public class SearchInRotatedArray {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6, };
    int target = 13;
    int start = 0;
    int end = arr.length - 1;
    int Pivot = findPivot(arr, start, end);
    System.out.println(Pivot);
    boolean result;
    if (target > arr[start]) {
      result = BinarySearch(arr, start, Pivot, target);
    } else {
      result = BinarySearch(arr, Pivot + 1, end, target);
    }
    System.out.println(result);
  }

  static int findPivot(int[] arr, int start, int end) {
    if (arr[start] < arr[end]) {
      return end;
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
      return end - 1;
    }
  }

  static Boolean BinarySearch(int[] arr, int start, int end, int target) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return true;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return false;
  }
}
