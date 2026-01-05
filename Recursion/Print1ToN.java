package Recursion;

// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        print1ToN(n, 1);
    }
    static void print1ToN(int n, int i){
        if (i == n + 1) {
            return;
        }
        System.out.print(i + " ");
        print1ToN(n, ++i);
    }
}
