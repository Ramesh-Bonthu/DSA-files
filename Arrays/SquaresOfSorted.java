package Arrays;
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;

public class SquaresOfSorted {
    public static void main(String[] args) {
        int[] num = {-7,-3,2,3,11};
        int[] ans = squaresOfSorted1(num);
        System.out.println(Arrays.toString(ans));
    }
    static int[] squaresOfSorted(int[] num){

        for(int i= 0; i < num.length; i++){
            num[i] = num[i]*num[i];
        }

        for(int i = 1; i < num.length; i++){
            int key = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > key) {
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
        
        return num;
    }
    static int[] squaresOfSorted1(int[] num){
        int[] ans = new int[num.length];
        int i = 0;
        int j = num.length-1;
        int k = ans.length-1;
        while (i <= j) {
            int left = num[i]*num[i];
            int right = num[j]*num[j];
            if (left > right) {
                ans[k] = left;
                i++; 
            }else{
                ans[k] = right;
                j--;
            }
            k--;
        }
        return ans;
    }
}
