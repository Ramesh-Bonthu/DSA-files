package Arrays.TwoPointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(moveZeros(arr)));
        
    }
    static int[] moveZeros(int[] arr){
        
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[i] != 0 && arr[j] != 0) {
                i++;
                j++;
            }
            else if (arr[i] == 0 && arr[j] == 0) {
                j++;
            }else if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        
        return arr;
    }
}
