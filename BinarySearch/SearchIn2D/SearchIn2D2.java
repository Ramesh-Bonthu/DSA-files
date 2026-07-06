package BinarySearch.SearchIn2D;

public class SearchIn2D2 {
    public static void main(String[] args) {
        
    }
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m =mat[0].length;

        if(mat[0][0] > x || mat[n - 1][m - 1] < x) return false;

        int row = -1;

        for(int i = 0; i < n; i++){
            if (x <= mat[i][m-1]) {
                row = i;
                break;
            }
        }

        return searchRow(mat, x, row);
        
    }
    public static boolean searchRow(int[][] mat, int x, int row){
        int s = 0;
        int e = mat[0].length - 1;

        while (s <= e) {
            int m = s + (e - s)/2;

            if(mat[row][m] == x){
                return true;
            }else if (mat[row][m] < x) {
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        
        
        return false;
    }
}
