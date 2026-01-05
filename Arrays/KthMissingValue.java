package Arrays;
public class KthMissingValue {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int k = 2;
    System.out.println(findKthPositive(arr, k));

  }

  static int findKthPositive(int[] arr, int k) {
    int[] nums = new int[k];
    int i = 0;
    int j = 0;
    int count = 1;
    while (j < k) {
      if (i > arr.length - 1 || arr[i] != count) {
        nums[j] = count;
        j++;
      } else {
        i++;
      }
      count++;
    }
    return nums[k - 1];
  }
}
