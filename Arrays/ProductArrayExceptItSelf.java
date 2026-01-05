package Arrays;
public class ProductArrayExceptItSelf {
  public static void main(String[] args) {
    int[] nums = { -1, 1, 0, 2, 3 };

    int[] ans = new int[nums.length];

    int count = 0;
    int index = Integer.MIN_VALUE;

    int product = 1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        index = i;
        count++;
        continue;
      }
      product *= nums[i];
    }
    if (count > 1) {
      System.out.println(ans);
    } else if (count == 1) {
      ans[index] = product;
    } else {
      for (int i = 0; i < ans.length; i++) {
        ans[i] = product / nums[i];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
