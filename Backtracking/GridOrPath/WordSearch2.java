package Backtracking.GridOrPath;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {
    public static void main(String[] args) {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };

        String[] words = {
            "oath",
            "pea",
            "eat",
            "rain"
        };

        System.out.println(findWords(board, words));
    }

    public static List<String> findWords(char[][] board, String[] words) {
        

        List<String> ans = new ArrayList<>();

        int n = board.length;
        int m = board[0].length;

        for(String word : words){

            char ch = word.charAt(0);

            for(int i = 0; i < n; i++){

                for(int j = 0; j < m; j++){

                    if (board[i][j] == ch) {
                        dfs(board, i, j, word, 1, ans,"" + ch);
                    }
                }
            }

        }

        return ans;
    }

    public static void dfs(char[][] board, int i, int j, String word, int index, List<String> ans, String update){
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == ' '){
            return;
        }

        if (index == word.length()) {
            ans.add(update);
            return;
        }

        char ch = board[i][j];

        char wordch = word.charAt(index);

        if (i - 1 >= 0 && board[i - 1][j] == wordch ) {
            board[i][j] = ' ';
            dfs(board, i - 1, j, word, index + 1, ans, update + wordch);
            board[i][j] = ch;
        }

        if ( i + 1 < board.length && board[i + 1][j] == wordch ) {
            board[i][j] = ' ';
            dfs(board, i + 1, j, word, index + 1, ans, update + wordch);
            board[i][j] = ch;
        }

        if (j - 1 >= 0 && board[i][j - 1] == wordch ) {
            board[i][j] = ' ';
            dfs(board, i, j - 1, word, index + 1, ans, update + wordch);
            board[i][j] = ch;
        }

        if (j + 1 < board.length && board[i][j + 1] == wordch ) {
            board[i][j] = ' ';
            dfs(board, i, j + 1, word, index + 1, ans, update + wordch);
            board[i][j] = ch;
        }
    }
}
