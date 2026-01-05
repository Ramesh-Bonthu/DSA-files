package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity/description/

public class SortByPartity {
  public static void main(String[] args) {
    int[] nums = { 3, 1, 2, 4 };
    nums = sortArrayByParity(nums);
    System.out.println(Arrays.toString(nums));
  }

  static int[] sortArrayByParity(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        list.add(nums[i]);
      } else {
        list.add(0, nums[i]);
      }
    }
    for (int i = 0; i < list.size(); i++) {
      nums[i] = list.get(i);
    }

    return nums;
  }
}
