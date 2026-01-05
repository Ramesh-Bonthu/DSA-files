package Arrays;
import java.util.Arrays;

public class Roatate {
  public static void main(String[] args) {
    int[][] mat = { { 0, 1 }, { 1, 0 } };
    int[][] target = { { 1, 0 }, { 0, 1 } };

    for (int m = 0; m < 4; m++) {
      if (Arrays.deepEquals(mat, target)) {
        System.out.print(1);
      }

      int k = mat.length;
      int[][] newMat = new int[k][k];
      for (int i = 0; i < mat.length; i++) {
        k = mat.length - 1;
        for (int j = 0; j < mat[i].length; j++, k--) {
          newMat[i][j] = mat[k][i];
        }
      }

      for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
          System.out.println(newMat[i][j]);
        }
      }

      for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
          mat[i][j] = newMat[i][j];
        }
      }
    }
    System.out.print(0);
  }
}
