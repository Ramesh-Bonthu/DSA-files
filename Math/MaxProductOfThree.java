package Math;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] num = {-2,-3,-1};
        System.out.println(maxProductOfThree(num));

    }
    static int maxProductOfThree(int[] num){
        
        Arrays.sort(num);
        int n = num.length;
        int max1 = num[n-1] * num[n-2] * num[n-3];
        int max2 = num[0] * num[1] * num[n-1];
        
        return Math.max(max1, max2);
    }
}
