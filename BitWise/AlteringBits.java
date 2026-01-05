package BitWise;
// https://leetcode.com/problems/binary-number-with-alternating-bits/description/

public class AlteringBits {
    public static void main(String[] args) {
      int num= 7;
      System.out.println(alteringBits1(num));
    }
    static boolean alteringBits(int num){
      int last = (num & 1);
      while (num > 0) {
        num >>= 1;
        int last1 = (num & 1);
        if (last1 == last) {
          return false;
        }
        last = last1;
      }
      return true;
    }
    static boolean alteringBits1(int num){
      
      while(num > 0){
        if ((num & 1) == ((num >> 1) & 1)) {
          return false;
        }
        num >>= 1;
      }
      
      return true;
    }
}
