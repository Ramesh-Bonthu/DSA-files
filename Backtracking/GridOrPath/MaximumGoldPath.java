package Backtracking.GridOrPath;

public class MaximumGoldPath {
    public static void main(String[] args) {
        
    }

    public int getMaximumGold(int[][] grid) {
        int maxgold = 0;
        
        int n = grid.length;
        int m = grid[0].length;

        for(int r = 0; r < n; r++ ){
            for(int c = 0; c < m; c++){
                if (grid[r][c] != 0) {
                    maxgold = Math.max(maxgold, dfs(grid, r, c));
                }
            }
        }

        return maxgold;
    }

    public static int dfs(int[][] grid, int r, int c){

        if (r < 0 || r >= grid.length || c < 0|| c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        int gold = grid[r][c];

        grid[r][c] = 0;

        int up = dfs(grid, r - 1, c);
        int bottom = dfs(grid, r + 1, c);
        int left = dfs(grid, r, c - 1);
        int right = dfs(grid, r, c + 1);

        grid[r][c] = gold;

        return gold + Math.max(Math.max(right, left), Math.max(up, bottom));
    }
}
