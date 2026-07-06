package Strings;

public class JumpGameVII {
  public static void main(String[] args) {
    String s = "01101110";
    int minJump = 2;
    int maxJump = 3;
    System.out.println(JumpGame(s, minJump, maxJump));
  }

  static boolean JumpGame(String s, int minJump, int maxJump) {
    int len = s.length();
    boolean[] dp = new boolean[len];
    int reachableCount = 0;
    dp[0] = true;

    for(int i = 1; i < len; i++){

      if (i-minJump >= 0 && dp[i-minJump]) {
        reachableCount++;
      }

      if (i-maxJump-1 >= 0 && dp[i-maxJump-1]) {
        reachableCount--;
      }

      if (reachableCount > 0 && s.charAt(i) == '0') {
        dp[i] = true;
      }
    }

    return dp[len-1];
  }
}
