package Arrays;
//https://leetcode.com/problems/search-a-2d-matrix/

public class Search2DMatrix {
  public static void main(String[] args) {
    int[][] mat = { { 1 } };
    int target = 2;
    System.out.println(SearchMatrix(mat, target));
  }

  static boolean SearchMatrix(int[][] mat, int target) {
    int count = 0;
    int low = 0;
    int high = mat[0].length - 1;

    if (mat.length < 2) {
      count = 0;
    } else if (target > mat[mat.length - 1][mat[0].length - 1]) {
      return false;
    } else {
      for (int i = 0; i <= mat.length - 1; i++) {
        if (mat[i][high] >= target) {
          break;
        } else {
          count++;
        }
      }
    }
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (mat[count][mid] == target) {
        return true;
      } else if (mat[count][mid] > target) {
        high = mid - 1;
      } else {
        low = low + 1;
      }
    }
    return false;
  }
}
