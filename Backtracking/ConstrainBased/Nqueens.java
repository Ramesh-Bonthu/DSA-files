package Backtracking.ConstrainBased;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        //List<List<String>> queen =  nQueens(board, 0);
        System.out.println(nQueens(board, 0));
    }

    static List<List<String>> nQueens(boolean[][] board, int row){
        //end condition
        if (row == board.length) {
            return display(board);
        }
        List<List<String>> queen = new ArrayList<>();

        //place a queen
        for(int col = 0; col < board.length; col++){
            //checking safe or not
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queen.addAll(nQueens(board, row+1));
                board[row][col] = false;
            }
        }
        return queen;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //for i to row (top)
        for(int i = 0; i < row; i++){
            if (board[i][col]) {
                return false;
            }
        }
        // checking left diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
            if (board[row - i][col - i]) {
                return false;
            }
        }

        //checking right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if (board[row - i][col + i]) {
                return false;
            }
        }
        
        return true;
    }

    static List<List<String>> display(boolean[][] board){
        List<List<String>> queen = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(boolean[] arr : board){
            
            String str = "";
            for(boolean val : arr){
                if (val) {
                    str += 'Q';
                }else{
                    str += '.';
                }
            }
            list.add(str);
            
        }
        queen.add(list);
        return queen;
    }
}
