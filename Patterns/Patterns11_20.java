package Patterns;

public class Patterns11_20 {
  public static void main(String[] args) {
    pattern18(5);
  }

  static void pattern18(int n) {
    int n1 = n, n2 = n + 1;
    for (int i = 1; i <= n; i++, n1--, n2++) {
      for (int j = 1; j <= 2 * n; j++) {
        if (j <= n1 || j >= n2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void pattern17(int n) {
    int down = n - 1;
    for (int i = 1; i <= 2 * n - 1; i++) {
      int count = i <= n ? i : down;
      int space = i <= n ? n - i : i - n;
      int col = i <= n ? 2 * i - 1 : 2 * down - 1;
      for (int s = 1; s <= space; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= col; j++) {
        if (j < n) {
          System.out.print(count);
          count--;
        } else {
          System.out.print(count);
          count++;
        }
      }
      if (i > n) {
        down--;
      }
      System.out.println();
    }
  }

  static void pattern15(int n) {
    int down = n - 1;
    for (int i = 1; i <= 2 * n - 1; i++) {
      int space = i <= n ? n - i : i - n;
      int col = i <= n ? 2 * i - 1 : 2 * down - 1;
      for (int s = 1; s <= space; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= col; j++) {
        if (j == 1 || j == col) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      if (i > n) {
        down--;
      }
      System.out.println();
    }
  }

  static void pattern14(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= i - 1; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * (n - i) + 1; j++) {
        if (i == 1 || j == 1 || j == 2 * (n - i) + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void pattern13(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (i == n || j == 1 || j == 2 * i - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void pattern12(int n) {
    for (int i = 1; i <= 2 * n; i++) {
      int space = i <= n ? i - 1 : 2 * n - i;
      int col = i <= n ? n - i + 1 : i - n;
      for (int s = 1; s <= space; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= col; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
