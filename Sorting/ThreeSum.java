package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,1,2,-1};
        threeSum(arr);
    }
    static void threeSum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= arr.length -3; i++){

            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            int j = i+1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while (j < k && arr[j] == arr[j+1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++; k--;
                }else if (arr[i] + arr[j] + arr[k] > 0) {
                    k--;
                }else{
                    j++;
                }
            }
        }
        System.out.println(list);
    }
}
