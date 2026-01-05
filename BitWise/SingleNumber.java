package BitWise;
// https://leetcode.com/problems/single-number/description/

public class SingleNumber {
  public static void main(String[] args) {
    int[] nums = { 4, 1, 2, 1, 2 };
    System.out.println(singleNumber(nums)); // Output: 4
  }

  static int singleNumber(int[] nums) {
    int single = 0;
    for (int i = 0; i < nums.length; i++) {
      single = single ^ nums[i];
    }
    return single;
  }
}
