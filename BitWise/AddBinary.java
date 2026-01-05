
// https://leetcode.com/problems/add-binary/description/

package BitWise;

import java.math.BigInteger;

public class AddBinary {
  public static void main(String[] args) {
    String a = "101";
    String b = "111";
    System.out.println(addBinary1(a, b));
  }

  static String addBinary(String a, String b) {
    BigInteger num1 = new BigInteger(a,2);
    BigInteger num2 = new BigInteger(b,2);
    BigInteger num = num1.add(num2);
    return num.toString(2);
  }

   static String addBinary1(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length()-1;
    int j = b.length()-1;


    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0) {
        carry += a.charAt(i--) - '0';
      }
      if (j >= 0) {
        carry += b.charAt(j--) - '0';
      }
      sb.append(carry%2);
      carry /= 2;
    }
    
    return sb.reverse().toString();
  }
}
