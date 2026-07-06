package Recursion;
// https://leetcode.com/problems/powx-n/description/
public class PowerOfXN {
    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        System.out.println(myPowRec(x,n,1));
    }

    static double powerofXN(double x, int n){
        double ans = x;

        if (n == 0 || x == 1) {
            return 1;
        }else if (n > 0) {
            for(int i = n-1 ; i > 0; i--){
                ans *= x;
            }   
            return ans; 
        }else{
            int val = Math.abs(n);
            for(int i = val-1 ; i > 0; i--){
                ans *= x;
            }
            return 1/ans;
        }
    }
     public double myPow(double x, int n) {
        double pow = 1;

        if(n < 0){
            n = -n;
            x = 1/x;
        }

        while(n != 0){
            if((n&1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;
        }
        return pow;
    }

    static double myPowRec(double x,int n,double pow){
        if (n == 0) {
            return pow;
        }
        if(n < 0){
            n = -n;
            x = 1/x;
        }

        if ((n & 1) != 0) {
            pow *= x;
        }

        return myPowRec(x*x, n >> 1, pow);
    }
}
