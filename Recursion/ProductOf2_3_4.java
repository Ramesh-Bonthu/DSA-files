package Recursion;

public class ProductOf2_3_4 {
    public static void main(String[] args) {

        int n = 16;
        System.out.println(powerOf2(n));
        
    }

    static boolean powerOf2(int n){
        if (n == 1 || n == 0) return true;

        if (n % 2 == 0) {
            return powerOf2(n/2);
        }else{
            return false;
        }
    }

    static boolean powerOf3(int n){
        if (n == 1 || n == 0) return true;

        if (n % 3 == 0) {
            return powerOf3(n/3);
        }else{
            return false;
        }
    }

    static boolean powerOf4(int n){
        if (n == 1 || n == 0) return true;

        if (n % 4 == 0) {
            return powerOf4(n/4);
        }else{
            return false;
        }
    }
}
