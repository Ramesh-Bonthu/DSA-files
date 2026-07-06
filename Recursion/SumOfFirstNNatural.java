package Recursion;

public class SumOfFirstNNatural {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfFirstNNatural(n));
    }

    static int sumOfFirstNNatural(int n){
        if (n == 0) return 0;

        return n + sumOfFirstNNatural(n-1);
    }
}
