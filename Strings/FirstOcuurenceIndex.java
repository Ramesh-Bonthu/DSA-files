package Strings;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FirstOcuurenceIndex {
  public static void main(String[] args) {
    String haystack = "leetcode";
    String needle = "letto";
    System.out.println(FirstIndex(haystack, needle));
  }

  static int FirstIndex(String haystack, String needle) {
    int len = needle.length();
    if (haystack.length() == needle.length()) {
      if (haystack.equals(needle)) {
        return 0;
      }
    }
    for (int i = 0; i <= haystack.length() - len; i++) {
      if (haystack.substring(i, i + len).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
