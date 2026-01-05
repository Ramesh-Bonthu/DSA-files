package Strings;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/1729715858/

public class StringEqualent {
  public static void main(String[] args) {
    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bc" };
    StringBuffer sb1 = new StringBuffer();
    StringBuffer sb2 = new StringBuffer();
    for (String st : word1) {
      sb1.append(st);
    }
    for (String st : word2) {
      sb2.append(st);
    }
    System.out.println(sb1 + "   " + sb2);
    if (sb1.toString().equals(sb2.toString())) {
      System.out.println(sb1);
    } else {
      System.out.println("no");
    }
  }
}
