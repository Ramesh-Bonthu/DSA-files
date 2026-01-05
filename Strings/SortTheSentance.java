package Strings;

// https://leetcode.com/problems/sorting-the-sentence/submissions/1727441379/

import java.util.Arrays;

public class SortTheSentance {
  public static void main(String[] args) {
    String s = "Myself2 Me1 I4 and3";
    String[] list = s.split(" ");

    String[] list1 = new String[list.length];
    Arrays.fill(list1, "0");

    for (int i = 0; i < list.length; i++) {
      char c = list[i].charAt(list[i].length() - 1);
      int digit = c - '0';
      list1[digit - 1] = list[i];
    }

    StringBuilder[] sb = new StringBuilder[list1.length];

    for (int i = 0; i < list1.length; i++) {
      sb[i] = new StringBuilder(list1[i]);
      sb[i].setCharAt(sb[i].length() - 1, ' ');
    }

    StringBuilder sb1 = new StringBuilder();
    for (int i = 0; i < sb.length; i++) {
      sb1.append(sb[i]);
    }

    sb1.deleteCharAt(sb1.length() - 1);

    System.out.println(s.toLowerCase());

    System.out.println(sb1);

  }
}
