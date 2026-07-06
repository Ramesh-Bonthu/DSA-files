package Graphs.DFS;

public class NoOfIslands {
    public static void main(String[] args) {
        
    }

    public int countIslands(char[][] grid) {
        int count = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 'L') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int i, int j){

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 'W') {
            return;
        }

        grid[i][j] = 'W';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i , j - 1);
        dfs(grid, i , j + 1);
        dfs(grid, i + 1, j + 1);
        dfs(grid, i - 1, j - 1);
        dfs(grid, i + 1, j - 1);
        dfs(grid, i - 1, j + 1);
    } 
}
