package Strings;

// https://leetcode.com/problems/valid-palindrome/submissions/1733069626/

public class Palindrome1 {
  public static void main(String[] args) {
    String s = "0P";
    System.out.println(Palin(s));
  }

  static boolean Palin(String s) {
    String alpha = "abcdefghijklmnopqrstuvwxyz0123456789";
    s = s.toLowerCase();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      if (alpha.contains(String.valueOf(s.charAt(i)))) {
        sb.append(s.charAt(i));
      }
    }
    System.out.println(sb);
    int i = 0;
    int j = sb.length() - 1;
    while (i <= j) {
      if (!(sb.charAt(i) == sb.charAt(j))) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
