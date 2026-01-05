package Arrays;

public class SprialMat1 {
  public static void main(String[] args) {
    int[][] mat = new int[3][3];

    int count = 0;

    int rs = 0;
    int re = mat.length - 1;
    int cs = 0;
    int ce = mat[0].length - 1;

    while (rs <= re && cs <= ce) {
      for (int i = cs; i <= ce; i++) {
        mat[rs][i] = ++count;
      }
      rs++;
      for (int i = rs; i <= re; i++) {
        mat[i][ce] = ++count;
      }
      ce--;
      if (rs <= re) {
        for (int i = ce; i >= cs; i--) {
          mat[re][i] = ++count;
        }
        re--;
      }
      if (cs <= ce) {
        for (int i = re; i >= rs; i--) {
          mat[i][cs] = ++count;
        }
        cs++;
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
    }
  }
}
