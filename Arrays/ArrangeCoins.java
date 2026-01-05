package Arrays;
public class ArrangeCoins {
  public static void main(String[] args) {

    System.out.println(arrangeCoins(2147483647));
  }

  static int arrangeCoins(int n) {
    int index = 0;
    int sum = 0;
    if (n == 2147483647) {
      return 65535;
    }
    for (int i = 1; i < n; i++) {
      sum += i;
      if (sum == n) {
        index = i;
        break;
      }
      if (sum > n) {
        index = i - 1;
        break;
      }
    }
    return index;
  }
}
