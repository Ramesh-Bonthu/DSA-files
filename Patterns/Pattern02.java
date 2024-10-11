package Patterns;

public class Pattern02 {
  public static void main(String[] args) {
    Pattern02 obj = new Pattern02();
    obj.noram();
    System.out.println();
    obj.invert();
    System.out.println();
    obj.num();
  }

  /*
   * *
   * **
   * ***
   * ****
   * *****
   */

  void noram() {
    for (int i = 1; i <= 5; i++) {
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

  void invert() {
    for (int i = 5; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /*
   * 1
   * 12
   * 123
   * 1234
   * 12345
   */

  void num() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
