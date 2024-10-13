package Patterns;

public class Pattern06 {
  public static void main(String[] args) {
    Pattern06 obj = new Pattern06();
    obj.triangle();
    System.out.println();
    obj.revTriangle();
  }

  void triangle() {
    for (int i = 1; i <= 5; i++) {
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (i == 5 || j == 1 || j == 2 * i - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  void revTriangle() {
    for (int i = 5; i >= 1; i--) {
      for (int s = 5; s >= i; s--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (i == 5 || j == 1 || j == 2 * i - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
/*
 * *
 * *8*
 * *888*
 * *88888*
 * *********
 */