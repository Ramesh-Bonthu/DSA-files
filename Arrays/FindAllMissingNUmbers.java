package Arrays;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

public class FindAllMissingNUmbers {
  public static void main(String[] args) {

    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    System.out.println(findDisappearedNumbers(nums));
  }

  static List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (i = 0; i < nums.length; i++) {
      if (nums[i] - 1 != i) {
        list.add(i + 1);
      }
    }
    return list;
  }

  static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}
