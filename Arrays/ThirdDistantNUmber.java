
package Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/third-maximum-number/

public class ThirdDistantNUmber {
  public static void main(String[] args) {
    int[] arr = { 2, 2, 3, 1 };
    System.out.println(ThirdDistant(arr));
  }

  static int ThirdDistant(int[] arr) {
    Arrays.sort(arr);
    int count = 1;
    int var = arr[arr.length - 1];
    if (arr.length <= 2) {
      return var;
    } else {
      for (int i = arr.length - 1; i >= 0; i--) {
        if (count == 3) {
          var = arr[i];
          break;
        } else if (i - 1 >= 0 && arr[i] != arr[i - 1]) {
          count++;
        }
      }
      return var;
    }
  }
}
