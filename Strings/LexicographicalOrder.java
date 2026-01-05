package Strings;

public class LexicographicalOrder {
  public static void main(String[] args) {
    String s = "abab";
    System.out.println(Lexicographical(s));
  }

  static String Lexicographical(String s) {
    char c = s.charAt(0);
    int j = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) > c) {
        c = s.charAt(i);
        j = i;
      }
    }
    return s.substring(j);
  }
}