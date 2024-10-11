package Patterns;

/*
 *      *
 *     **
 *    ***
 *   ****
 */
public class Pattern03 {
  public static void main(String[] args) {
    Pattern03 obj = new Pattern03();
    obj.spPattern();
    System.out.println();
    obj.spRevPattern();
  }

  void spPattern() {
    for (int i = 1; i <= 5; i++) {
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
   * *****
   * ****
   * ***
   * **
   * *
   */

  void spRevPattern() {
    for (int i = 1; i <= 5; i++) {
      for (int s = 1; s <= i; s++) {
        System.out.print(" ");
      }
      for (int j = 5; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
