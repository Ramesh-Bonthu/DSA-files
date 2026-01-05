package Arrays;

public class MaxSubArr {
  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int max = 0;
    // int max = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = i; j < nums.length; j++) {
        for (int k = i; k <= j; k++) {
          count += nums[k];
        }
        System.out.println(count);
        if (count > max) {
          max = count;
        }
      }
    }
    System.out.println(max);
  }
}
