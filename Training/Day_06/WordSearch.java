package Training.Day_06;

public class WordSearch {
    public static void main(String[] args) {
        char[][] mat = {
            {'A', 'B', 'C','E'}, {'S', 'F', 'E','S'}, {'A', 'D', 'E','E'}
        };

        String word = "ABCESEEEFS";
        boolean ans = false;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == word.charAt(0)) {
                    if(solve(mat, word, i, j, 0)){
                        ans = true;
                        break;
                    } 
                }
            }
        }
        System.out.println(ans);
    }


    public static boolean solve(char[][] mat, String word,int i, int j,int ind){
        if (ind >= word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length|| mat[i][j] != word.charAt(ind)) {
            return false;
        }

        char ch = mat[i][j];
        mat[i][j] = ' ';
        boolean l = solve(mat, word, i, j-1, ind+1);
        boolean r = solve(mat, word, i, j+1, ind+1);
        boolean u = solve(mat, word, i-1, j, ind+1);
        boolean d = solve(mat, word, i+1, j, ind+1);
        mat[i][j] = ch;

        return l||r||u||d;
    }
}
