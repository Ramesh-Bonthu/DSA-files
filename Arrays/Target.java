package Arrays;

public class Target {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4 };
    int[] index = { 0, 1, 2, 2, 1 };
    createTargetArray(nums, index);

  }

  public static void createTargetArray(int[] nums, int[] index) {
    int[] target = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int temp = index[i];
      if (temp >= i) {
        target[i] = nums[i];
        // System.out.print(target[i]);
      } else {
        int j;
        for (j = i; j > temp; j--) {
          target[j] = target[j - 1];
        }
        target[j] = nums[i];
        // System.out.print(target[i]);
      }
    }
    for (int i = 0; i < target.length; i++) {
      System.out.println(target[i]);
    }
  }
}
