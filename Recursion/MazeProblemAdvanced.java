package Recursion;

import java.util.Arrays;

public class MazeProblemAdvanced {
    public static void main(String[] args) {
        String p = "";
        int r = 0;
        int c = 0;
        boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int step = 0;
        int[][] path = new int[arr.length][arr[0].length];
        allPathPrint(p, r, c,arr,path,step);
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

    static void allPathPrint(String p,int r, int c,boolean[][] arr,int[][] path, int step){
        if (r == arr.length - 1 && c == arr[0].length -1) {
            path[r][c] = step + 1;
            for(int[] a : path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!arr[r][c]) {
            return;
        }

        arr[r][c] = false;
        path[r][c] = step + 1;

        if (r < arr.length -1) {
            allPathPrint(p + 'D', r+1, c, arr,path,step+1);
        }

        if (c < arr[0].length - 1) {
            allPathPrint(p + 'R' , r, c+1, arr,path,step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', r-1, c, arr,path,step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', r, c-1, arr,path,step+1);
        }

        //Backtracking
        arr[r][c] = true;
        path[r][c] = 0;

    }
}
