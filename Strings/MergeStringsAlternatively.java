package Strings;

// https://leetcode.com/problems/merge-strings-alternately/submissions/1734338163/

public class MergeStringsAlternatively {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "pqr";
    String res = MergeStrings(s1, s2);
    System.out.println(res);
  }

  static String MergeStrings(String s1, String s2) {
    StringBuilder sb = new StringBuilder();
    if (s1.length() < s2.length()) {
      for (int i = 0; i < s1.length(); i++) {
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
      }
      sb.append(s2.substring(s1.length()));
    } else if (s1.length() > s2.length()) {
      for (int i = 0; i < s2.length(); i++) {
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
      }
      sb.append(s1.substring(s2.length()));
    } else {
      for (int i = 0; i < s1.length(); i++) {
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
      }
    }
    s1 = new String(sb);

    return s1;
  }
}
