package Backtracking.GridOrPath;

import java.util.Arrays;

public class SudukoSlover {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        sover(board);
        for(char[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
    }   
    static void sover(char[][] board){
        helper(board,0,0);
    } 
    static boolean helper(char[][] board,int row,int col){
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
            
        }

        for(char dig = '1'; dig <= '9'; dig++){
            if (isSafe(board,row,col,dig)) {
                board[row][col] = dig;
                if(helper(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    static boolean isSafe(char[][] board,int row,int col,char dig){
        // col
        for(int i = 0; i < 9; i++){
            if (board[row][i] == dig) {
                return false;
            }
        }

        // row
        for(int i = 0; i < 9; i++){
            if (board[i][col] == dig) {
                return false;
            }
        }

        //3*3 grid
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i = startRow; i <= startRow + 2; i++){
            for(int j = startCol; j <= startCol + 2; j++){
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }

        
        return true;
    }
}
