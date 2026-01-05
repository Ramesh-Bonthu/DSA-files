package Strings;

// https://leetcode.com/problems/defanging-an-ip-address/description/

public class DefangingIPAddress {
  public static void main(String[] args) {
    String address = "255.100.50.0";
    DefangingIP(address);
  }

  static void DefangingIP(String address) {
    int len = address.length();
    int i = 0;
    StringBuilder sb = new StringBuilder();
    while (i < len) {
      char var = address.charAt(i);
      if (var == '.') {
        sb.append("[.]");
      } else {
        sb.append(var);
      }
      i++;
    }
    System.out.println(sb);
  }
}
