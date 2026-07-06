package Backtracking.GridOrPath;

public class N_Knights {
    public static void main(String[] args) {
        int target = 4;
        boolean[][] board = new boolean[target][target];
        knights(board, 0, 0, target);
        
    }
    static void knights(boolean[][] board, int row, int col, int target){
        if (target == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knights(board, row+1, 0, target);
            return;
        }

        if (isSafe(board,row,col)) {
            board[row][col] = true;
            knights(board, row, col+1, target-1);
            board[row][col] = false;
        }
        knights(board, row, col+1, target);
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        if (isValid(board,row-2,col+1)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }

        if (isValid(board,row-2,col-1)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }

        if (isValid(board,row-1,col+2)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }

        if (isValid(board,row-1,col-2)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }

        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if (row >= 0 && row <= board.length -1 && col >= 0 && col <= board.length -1) {
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){

        for(boolean[] arr : board){
            for(boolean val : arr){
                if (val) {
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();    
        }
    }
}

