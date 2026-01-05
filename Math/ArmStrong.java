package Math;

public class ArmStrong {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(armStrong(num));

    }
    static boolean armStrong(int num){
        int sum = 0;
        int temp = num;
        while(num > 0){
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
}
