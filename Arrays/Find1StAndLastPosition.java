package Arrays;
public class Find1StAndLastPosition {
  public static void main(String[] args) {
    int[] arr = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    findIndex(arr, target);
  }

  static void findIndex(int[] arr, int target) {
    int[] ans = new int[2];
    ans[0] = BinarySearch(arr, target, true);
    ans[1] = BinarySearch(arr, target, false);
    for (int i : ans) {
      System.out.println(i);
    }
  }

  static int BinarySearch(int[] arr, int target, boolean position) {
    int start = 0;
    int end = arr.length - 1;
    int first = -1;
    int last = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        if (position) {
          first = mid;
          end = mid - 1;
        } else {
          last = mid;
          start = mid + 1;
        }
      }
    }
    if (position) {
      return first;
    } else {
      return last;
    }
  }
}
