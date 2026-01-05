package Arrays;
public class FindPeackInMoutainArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 7, 9, 6, 3, 2 };
    int target = 6;
    System.out.println(FindIndex(arr, target));
  }

  static int FindIndex(int[] arr, int target) {
    int peak = findPeak(arr);

    if (arr[peak] == target) {
      return peak;
    } else {
      int result = SearchAss(arr, 0, peak - 1, target);
      if (result != -1) {
        return result;
      } else {
        result = SearchDes(arr, peak + 1, arr.length - 1, target);
        return result;
      }
    }
  }

  static int findPeak(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (mid > 0 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

  static int SearchAss(int[] arr, int start, int end, int target) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  static int SearchDes(int[] arr, int start, int end, int target) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
