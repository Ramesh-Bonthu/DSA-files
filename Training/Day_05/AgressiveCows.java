package Training.Day_05;

import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
        
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int l = 0;
        int r = stalls[n-1] - stalls[0];
        int ans = 0;
        while(l <= r){
            int mid = l + (r - l)/2;
            if (safe(stalls, k, mid)) {
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }

        }
        return ans;
    }

    public static Boolean safe(int[] stalls, int k, int dis){
        int p = stalls[0];
        int cows = 1;

        for(int i = 1; i < stalls.length; i++){
            if (stalls[i] - p >= dis) {
                cows++;
                p = stalls[i];
            }
        }

        return cows >= k;
    }
}
