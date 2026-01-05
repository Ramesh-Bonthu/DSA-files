package Arrays;
import java.util.ArrayList;

public class Spiral {
  public static void main(String[] args) {
    int[][] mat = {
        { 3 },
        { 2 }
    };

    ArrayList<Integer> list = new ArrayList<>();

    int rs = 0;
    int re = mat.length - 1;
    int cs = 0;
    int ce = mat[0].length - 1;

    while (rs <= re && cs <= ce) {
      for (int i = cs; i <= ce; i++) {
        list.add(mat[rs][i]);
      }
      rs++;
      for (int i = rs; i <= re; i++) {
        list.add(mat[i][ce]);
      }
      ce--;
      if (rs <= re) {
        for (int i = ce; i >= cs; i--) {
          list.add(mat[re][i]);
        }
        re--;
      }
      if (cs <= ce) {
        for (int i = re; i >= rs; i--) {
          list.add(mat[i][cs]);
        }
        cs++;
      }
    }
    System.out.println(list);
  }
}
