package Patterns;

/*
 *     1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 */
public class PascalPattern07 {
  public static void main(String[] args) {
    int p = 0;
    for (int i = 0; i < 7; i++) {
      for (int k = 7; k >= i; k--)
        System.out.print(" "); // for space
      for (int j = 0; j < i; j++) {
        if (i == 0 || j == 0) {
          p = 1;
        } else {
          p = p * (i - j) / j;
        }
        System.out.print(p + " ");
      }
      System.out.println();
    }
  }
}
