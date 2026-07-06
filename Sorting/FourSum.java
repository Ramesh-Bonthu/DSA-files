package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSum(nums, target));
        
    }
    static List<List<Integer>> fourSum(int[] arr,int target){
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 3; i++){
            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            for(int j = i+1; j < arr.length -2; j++){
                if (j > i+1 && arr[j] == arr[j-1]) {
                    continue;
                }
                int k = j+1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = (long)arr[i] + arr[j] + arr[k]+ arr[l];
                    if (sum == target) {
                        list.add(Arrays.asList(arr[i], arr[j], arr[k],arr[l]));
                        while (k < l && arr[k] == arr[k+1] ) k++; 
                        while (k < l && arr[l] == arr[l-1] ) l--;
                        k++; l--; 
                    }else if (sum > target) {
                        l--;
                    }else{
                        k++;
                    }
                }
            }   
        }
        
        return list;
    }
}
