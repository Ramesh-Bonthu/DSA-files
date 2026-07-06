package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setMatrixZeroes(mat);
    }
    public static void setMatrixZeroes(int[][] mat) {   
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == 0) {
                    if (!row.contains(i)) {
                        row.add(i);
                    }
                    if (!col.contains(j)) {
                        col.add(j);
                    }
                }
            }
        }

        for(int i = 0; i < row.size(); i++){
            int k = row.get(i);
            for(int j = 0; j < mat[i].length; j++){
                mat[k][j] = 0;
            }
        }

        for(int i = 0; i < col.size(); i++){
            int k = col.get(i);
            for(int j = 0; j < mat.length; j++){
                mat[j][k] = 0;
            }
        }

        for(int[] arr: mat){
            System.out.println(Arrays.toString(arr));
        }
    }
}
