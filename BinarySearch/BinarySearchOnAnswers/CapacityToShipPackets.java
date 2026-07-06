package BinarySearch.BinarySearchOnAnswers;

public class CapacityToShipPackets {
    public static void main(String[] args) {
        int[] weights = {91 ,73 ,36 ,79 ,95 ,77 ,40 ,52 ,55 ,30 ,74 ,18 ,55 ,71 ,87 ,15 ,54 ,50 ,14 ,87 ,59 ,26 ,44 ,34 ,58 ,21 ,22 ,74 ,97 ,17 ,60 ,29 ,57 ,73};
        int days = 24;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        int l = 1;
        int r = 0;

        for(int a : weights){
            r += a;
            l = Math.max(l,a);
        }

        ans = r;

        while(l <= r){
            int m = l + (r - l)/2;

            if (isSafe(weights, m, days)) {
                ans = m;
                r = m - 1;
            }else{
                l = m + 1;
            }
            
        }

        return ans;
    }

    public static boolean isSafe(int[] weights, int ans, int days){
        int count = 1;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){

            if (sum + weights[i] <= ans) {
                sum += weights[i];
            }else{
                count++;
                sum = weights[i];
            }
        }

        if (count <= days) {
            return true;
        }
        
        return false;
    }
}
