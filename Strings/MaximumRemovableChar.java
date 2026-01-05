package Strings;

public class MaximumRemovableChar {
  public static void main(String[] args) {
    String s = "qobftgcueho";
    String p = "obue";
    int[] removable = { 5, 3, 0, 6, 4, 9, 10, 7, 2, 8 };
    System.out.println(maximumChar(s, p, removable));

  }

  static int maximumChar(String s, String p, int[] removable) {
    int count = 0;
    StringBuffer sb = new StringBuffer(s);
    StringBuffer sb1 = new StringBuffer();
    System.out.println(sb);
    for (int i = 0; i < removable.length; i++) {
      char value = s.charAt(removable[i]);
      System.out.println(value);
      String updated = sb.toString().replaceFirst(String.valueOf(value), "");
      sb1.setLength(0);
      sb1.append(updated);
      System.out.println(sb1);
      if (checkSeq(sb1, p)) {
        count++;
      } else {
        return count;
      }
    }
    return count;
  }

  static boolean checkSeq(StringBuffer sb, String p) {
    int index = 0;
    int max = index;
    for (int i = 0; i < p.length(); i++) {
      max = sb.toString().indexOf(p.charAt(i));
      if (max >= index) {
        index = max;
      } else {
        return false;
      }
    }
    return true;
  }
}
