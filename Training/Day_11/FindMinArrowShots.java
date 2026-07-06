package Training.Day_11;

import java.util.Arrays;

public class FindMinArrowShots {
    public static void main(String[] args) {
        
    }
    public static int findMinArrowShots(int[][] points) {
        int arrow = 1;
        Arrays.sort(points,(a,b) -> Integer.compare(a[1], b[1]));
        int current = points[0][1];
        int n = points.length;
        for(int i = 1; i < n; i++){
            if (!(points[i][0] <= current)) {
                current = points[i][1];
                arrow++;
            }
        }
        return arrow;
    }
}
