package Arrays;

public class JumpGame {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4 };
    System.out.println(jump(arr));
  }

  static boolean jump(int[] arr) {
    int i = 0;
    while (i != arr.length - 1) {
      if (arr[i] == 0) {
        return false;
      }
      i += arr[i];
    }

    return true;
  }
}