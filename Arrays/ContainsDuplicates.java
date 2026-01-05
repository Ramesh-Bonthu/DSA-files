package Arrays;
import java.util.Arrays;
//https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicates {
  public static void main(String[] args) {
    int[] num1 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    System.out.println(containsDuplicate(num1));
  }

  static boolean containsDuplicate(int[] num1) {
    Arrays.sort(num1);
    for (int i = 0; i < num1.length - 1; i++) {
      if (num1[i] == num1[i + 1]) {
        return true;
      }
    }
    return false;
  }
}
