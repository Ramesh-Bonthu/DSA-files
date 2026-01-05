package Arrays;
public class ReachANumber {
  public static void main(String[] args) {
    int num = 2;
    System.out.println(ReachNumber(num));
  }

  static int ReachNumber(int target) {
    int count = 0;
    int i = 1;

    target = Math.abs(target);
    int sum = 0;
    while (true) {
      sum += i;
      count++;
      if (sum >= target) {
        if ((sum - target) % 2 == 0) {
          return count;
        }
      }
      i++;
    }
  }
}
