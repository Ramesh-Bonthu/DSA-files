package Recursion;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(primeOrNot(num, 2));
    }

    static boolean primeOrNot(int num,int i){

        if (num == 2) return true;
        
        if(i * i >= num){
            return true;
        }

        if (num % i == 0) {
            return false;
        }

        return primeOrNot(num, i+1);

    }
}
