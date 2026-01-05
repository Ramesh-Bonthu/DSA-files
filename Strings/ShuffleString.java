package Strings;

//  https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
  public static void main(String[] args) {
    String str = "codeleet";
    int[] ind = { 4, 5, 6, 7, 0, 2, 1, 3 };
    str = Shuffle(str, ind);
    System.out.println(str);
  }

  static String Shuffle(String str, int[] ind) {
    char[] result = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      result[ind[i]] = str.charAt(i);
    }

    return new String(result);
  }

}
