package BitWise;

import java.util.Arrays;

public class DecodedXOR {
    public static void main(String[] args) {
        int[] arr = {6,2,7,3};
        int first = 4;
        System.out.println(Arrays.toString(decodedXOR(arr, first)));
    }

    static int[] decodedXOR(int[] arr, int first){
        int[]  ans = new int[arr.length+1];
        
        ans[0] = first;

        for(int i = 0; i < arr.length; i++){
            ans[i+1] = ans[i] ^ arr[i];
        }
        
        return ans;
    }
}
