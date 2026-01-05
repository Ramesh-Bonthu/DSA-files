package BitWise;

public class NoOfBitsToZero {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(noOfSteps(num));
    }
    static int noOfSteps(int num){
        int count = 0;

        while (num > 0) {
            if ((num&1) == 0) {
                num >>= 1;
            }else{
                num -= 1;
            }
            count++;
        }
        
        return count;
    }
}
