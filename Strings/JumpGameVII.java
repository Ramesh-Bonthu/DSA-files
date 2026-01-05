package Strings;

public class JumpGameVII {
  public static void main(String[] args) {
    String s = "01111111011110";
    int minJump = 1;
    int maxJump = 9;
    System.out.println(JumpGame(s, minJump, maxJump));
  }

  static boolean JumpGame(String s, int minJump, int maxJump) {
    int len = s.length() - 1;
    int i = 0;

    while (i <= len) {
      int j = i + minJump;
      int k = i + maxJump;
      if (j <= len && s.charAt(j) == '0') {
        i += j;
      } else if (k <= len && s.charAt(k) == '0') {
        i += k;
      } else {
        return false;
      }
      if (i == len) {
        return true;
      }
    }

    return true;
  }
}
