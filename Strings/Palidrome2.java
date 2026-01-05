package Strings;

// https://leetcode.com/problems/valid-palindrome-ii/description/

public class Palidrome2 {
  public static void main(String[] args) {
    String s = "eceec";
    if (ChechPalin(s) || ChechPalin1(s)) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }

  static boolean ChechPalin(String s) {
    int i = 0;
    int j = s.length() - 1;
    int count = 0;
    while (i <= j) {
      if (s.charAt(i) == s.charAt(j)) {
        i++;
        j--;
      } else {
        if (count == 0 && (s.charAt(i) == s.charAt(j - 1))) {
          count++;
          i++;
          j -= 2;
        } else if (count == 0 && (s.charAt(i + 1) == s.charAt(j))) {
          i += 2;
          count++;
          j--;
        } else {
          return false;
        }
      }
    }
    return true;
  }

  static boolean ChechPalin1(String s) {
    int i = 0;
    int j = s.length() - 1;
    int count = 0;
    while (i <= j) {
      if (s.charAt(i) == s.charAt(j)) {
        i++;
        j--;
      } else {
        if (count == 0 && (s.charAt(i + 1) == s.charAt(j))) {
          i += 2;
          count++;
          j--;
        } else if (count == 0 && (s.charAt(i) == s.charAt(j - 1))) {
          count++;
          i++;
          j -= 2;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
