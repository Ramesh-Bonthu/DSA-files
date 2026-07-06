package Training.Day_05;

public class FloorSqrt {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(floorSqrt(n));
    }
    static int floorSqrt(int n) {
        int l = 0;
        int r = n;
        int ans = 0;
        while(l <= r){
            int m = l + (r-l)/2;

            if(m * m <= n){
                ans = m;
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }
}
