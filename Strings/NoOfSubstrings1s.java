package Strings;

import java.util.ArrayList;

public class NoOfSubstrings1s {
  public static void main(String[] args) {
    String s = "111111";
    System.out.println(CheckOnes(s));
  }

  static int CheckOnes(String s) {
    int count = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        arr.add(count);
        count = 0;
      } else {
        count++;
      }
    }
    arr.add(count);
    count = 0;
    for (int i = 0; i < arr.size(); i++) {
      count += CountTotal(arr.get(i));
    }

    return count;
  }

  static int CountTotal(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
