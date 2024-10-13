package Patterns;

public class Pattern05 {
  public static void main(String[] args) {
    Pattern05 obj = new Pattern05();
    obj.triangle();
    System.out.println();
    obj.revTriangle();
  }
  /*
   * *
   * * *
   * * * *
   * * * * *
   * * * * * *
   * code is right for triangle pattern but above pattern is incorrect
   */

  void triangle() {
    for (int i = 1; i <= 5; i++) {
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
   * * * * * *
   * * * * *
   * * * *
   * * *
   * *
   * code is right for triangle pattern but above pattern is incorrect
   */

  void revTriangle() {
    for (int i = 5; i >= 1; i--) {
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
