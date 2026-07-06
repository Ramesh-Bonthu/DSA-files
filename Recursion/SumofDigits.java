package Recursion;

// https://www.geeksforgeeks.org/dsa/sum-digit-number-using-recursion/

public class SumofDigits {
    public static void main(String[] args) {
        int num = 45632;
        System.out.println(sumofDigits(num));
    }

    static int sumofDigits(int num){
        if (num == 0) {
            return 0;
        }

        return num%10 + sumofDigits(num/10);
    }
}
