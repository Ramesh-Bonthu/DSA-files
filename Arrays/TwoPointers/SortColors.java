package Arrays.TwoPointers;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,1,0,2,1};
        System.out.println(Arrays.toString(sortColors(arr)));
        
    }
    static int[] sortColors(int[] arr){
        int r = 0;
        int w = 0;
        int b = arr.length-1;

        while (w <= b) {
            if (arr[w] == 1) {
                w++;
            }
            else if (arr[w] == 2) {
                int temp = arr[b];
                arr[b] = arr[w];
                arr[w] = temp;
                b--;
            }
            else{
                int temp = arr[r];
                arr[r] = arr[w];
                arr[w] = temp;
                r++;
                w++;
            }
        }

        
        return arr;
    }
}
