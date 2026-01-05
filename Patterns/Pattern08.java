package Patterns;

/*
 *   1
    212
   32123
  4321234
 543212345
 */

public class Pattern08 {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      int k = i;
      int r = 0;
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (i == 1) {
          System.out.print(k);
        } else {
          if (k == 1) {
            System.out.print(k);
            k++;
            r = k;
          } else if (r < 2 * i - 1 && r > 0) {
            System.out.print(r);
            r++;
          } else {
            System.out.print(k);
            k--;
          }
        }
      }
      System.out.println();
    }
  }
}
