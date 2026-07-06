package Training.Day_08;

public class FloodFlodAlgo {
    public static void main(String[] args) {
        
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    public static void dfs(int[][] image, int i, int j, int newColor,int color){
        if (i < 0|| j < 0|| i >= image.length||  j >= image[0].length|| image[i][j] != color) {
            return;
        }
        image[i][j] = newColor;

        dfs(image, i+1, j, newColor, color);
        dfs(image, i-1 ,j, newColor, color);
        dfs(image, i, j-1, newColor, color);
        dfs(image, i, j+1, newColor, color);
    }
}
