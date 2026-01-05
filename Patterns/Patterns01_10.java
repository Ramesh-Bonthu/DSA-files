package Patterns;

// https://github.com/Ramesh-Bonthu/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Patterns01_10 {
  public static void main(String[] args) {
    pattern11(5);
  }

  static void pattern11(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= i - 1; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern9(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= i - 1; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * (n - i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern8(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern7(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= i - 1; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int col = i <= n ? i : i - n;
      if (i <= n) {
        for (int j = 1; j <= col; j++) {
          System.out.print("*");
        }
      } else {
        for (int j = 1; j <= n - col; j++) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
