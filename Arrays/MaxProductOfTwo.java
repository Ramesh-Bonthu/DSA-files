package Arrays;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

public class MaxProductOfTwo {
  public static void main(String[] args) {
    int[] nums = { 1, 5, 4, 5 };
    System.out.println(maxProduct(nums));
  }

  static int maxProduct(int[] nums) {
    int product = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      int count = 1;
      for (int j = i + 1; j < nums.length; j++) {
        count = (nums[i] - 1) * (nums[j] - 1);
        if (count > product) {
          product = count;
        }
      }
    }
    return product;
  }
}
