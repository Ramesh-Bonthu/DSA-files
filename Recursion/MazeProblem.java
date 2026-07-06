package Recursion;

public class MazeProblem {
    public static void main(String[] args) {

    }
    static int path(String p, int r, int c){
        if(r==1 && c==1){
            return 1;
        }
        int count = 0;
        if (r > 1) {
            count += path(p + 'D', r-1, c);
        }
        if (c > 1) {
            count += path(p+'R', r, c-1);
        }
        return count;
    }
    static void pathWithDia(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1) {
            pathWithDia(p + 'D', r-1, c-1);
        }
        if (r > 1) {
            pathWithDia(p + 'V', r-1, c);
        }
        if (c > 1) {
            pathWithDia(p + 'H', r, c-1);
        }
    }

    static void allPath(String p,int r, int c,boolean[][] arr){
        if (r == arr.length - 1 && c == arr[0].length -1) {
            System.out.println(p);
            return;
        }

        if (!arr[r][c]) {
            return;
        }

        arr[r][c] = false;

        if (r < arr.length -1) {
            allPath(p + 'D', r+1, c, arr);
        }

        if (c < arr[0].length - 1) {
            allPath(p + 'R' , r, c+1, arr);
        }

        if (r > 0) {
            allPath(p + 'U', r-1, c, arr);
        }

        if (c > 0) {
            allPath(p + 'L', r, c-1, arr);
        }

        //Backtracking
        arr[r][c] = true;

    }
}
