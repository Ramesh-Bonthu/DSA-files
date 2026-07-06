package Training.Day_06;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}
        };
        System.out.println(ratInMaze(maze));
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>(); 
        slove(maze, 0, 0, "", ans);
        return ans;
    }
    static void slove(int[][] maze, int i,int j,String temp,ArrayList<String> ans){
        int n = maze.length;
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0) {
            return;
        }

        if(i == n-1 && j == n-1){
            ans.add(temp);
            return;
        }

        maze[i][j] = 0;
        slove(maze, i+1, j, temp + "D", ans);
        slove(maze, i, j-1, temp + "L", ans);
        slove(maze, i, j+1, temp + "R", ans);
        slove(maze, i-1, j, temp + "U", ans);
        maze[i][j] = 1;
    }
}
