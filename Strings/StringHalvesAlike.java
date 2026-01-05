package Strings;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/submissions/1731826728/

public class StringHalvesAlike {
  public static void main(String[] args) {
    String s = "book";
    s = s.toLowerCase();
    int count1 = 0;
    int count2 = 0;
    String vowel = "aeiou";
    /*
     * String s1 = s.substring(0, s.length() / 2);
     * String s2 = s.substring(s.length() / 2);
     * int count1 = 0;
     * int count2 = 0;
     * String vowel = "aeiou";
     * for (int i = 0; i < s1.length(); i++) {
     * if (vowel.contains(String.valueOf(s1.charAt(i)))) {
     * count1++;
     * }
     * if (vowel.contains(String.valueOf(s2.charAt(i)))) {
     * count2++;
     * }
     * }
     */
    for (int i = 0; i < s.length() / 2; i++) {
      if (vowel.contains(String.valueOf(s.charAt(i)))) {
        count1++;
      }
    }
    for (int i = s.length() / 2; i < s.length(); i++) {
      if (vowel.contains(String.valueOf(s.charAt(i)))) {
        count2++;
      }
    }
    if (count1 == count2) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
