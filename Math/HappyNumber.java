package Math;

// https://leetcode.com/problems/happy-number/description/

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(happyNumbercheck(num));
    }
    static boolean happyNumber(int num){
        int sum = 0;
        int temp = num;
        int n = num;
        while(num != 1){
            sum = 0;
            n = num;
            while(n > 0){
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            if(temp == sum){
                return false;
            }
            num = sum;
        }
        return true;
    }

    static boolean happyNumbercheck(int n){
        
        int slow = n;
        int fast = n;

        do{
            slow = squareNum(slow);
            fast = squareNum(squareNum(fast));            
        }while(slow != fast);
        
        return slow == 1;
    }

    static int squareNum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
