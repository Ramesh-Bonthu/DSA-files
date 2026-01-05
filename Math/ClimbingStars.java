package Math;

public class ClimbingStars {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStars(n));
    }
    static int climbingStars(int n){
        int count = 0;
        int n1 = 0;
        int n2 = 1;

        while (count < n) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count++;
        }

        
        return n2;
    }
}   
