package Math;
// https://leetcode.com/problems/power-of-two/description/
// https://leetcode.com/problems/power-of-four/

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(powerOfTwo1(n));

    }
    static boolean powerOfTwo(int n){
        if (n <= 0) {
            return false;
        }
        return (n&(n-1)) == 0;
    }
    static boolean powerOfTwo1(int n){
        
        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }

    static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        
        return n == 1;
    }
    public boolean isPowerOfThree(int n) {
        while(n > 0 && n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
