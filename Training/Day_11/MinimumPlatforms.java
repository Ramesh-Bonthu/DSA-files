package Training.Day_11;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        
    }   
    public static  int minPlatform(int arr[], int dep[]) {
        int paltforms = 0;
        int ans = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = dep.length;

        while (i < n && j < m) {
            if (arr[i] <= dep[i]) {
                paltforms += 1;
                i++;
            }else{
                paltforms -= 1;
                j++;
            }
            ans = Math.max(ans, paltforms);
        }

        
        return ans;
        
    } 
}
