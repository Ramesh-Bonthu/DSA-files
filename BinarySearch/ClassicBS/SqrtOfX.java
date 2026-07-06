package BinarySearch.ClassicBS;

public class SqrtOfX {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
    public static int floorSqrt(int n) {
        int ans = 1;
        
        if(n <= 2) return 1;

        int s = 1;
        int e = n/2;

        while(s <= e){
            int m = s + (e - s)/2;

            if (m * m <= n) {
                ans = m;
                s = m + 1;
            }else{
                e = m - 1;
            }
        }

        return ans;
    }
}
