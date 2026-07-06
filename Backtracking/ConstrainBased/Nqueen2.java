package Backtracking.ConstrainBased;

public class Nqueen2 {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        System.out.println(nQueens1(board, 0,0));
    }

    static int nQueens1(boolean[][] board,int row,int col){
        if (row == board.length) return 1;

        if (col == board.length) return 0;

        int count = 0;

        if(isSafe(board,row,col)){
            board[row][col] = true;
            count += nQueens1(board, row+1,0);
            board[row][col] = false;
        }
        count += nQueens1(board,row,++col);
        return count;
    }

    static int nQueens(boolean[][] board,int row){
        if(row == board.length){
            return 1;
        }

        int count = 0;

        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        
        for(int i = 0; i < row; i++){
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row,col);
        for(int i = 1; i <= maxLeft; i++){
            if (board[row-i][col-i]) {
                return false;
            }
        }

        int maxRight = Math.min(row,board.length - col-1);
        for(int i = 1; i <= maxRight; i++){
            if (board[row-i][col+i]) {
                return false;
            }
        }
        
        return true;
    }
}
