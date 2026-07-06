package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class RealtiveSortArray {
    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        System.out.println(Arrays.toString(realtiveSortArray(arr1, arr2)));
    }
    static int[] realtiveSortArray(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr1);

        int max = arr2[0];

        for(int i = 0; i < arr2.length; i++){
            if (arr2[i] > max) {
                max = arr2[i];
            }
            for(int j = 0; j < arr1.length; j++){
                if (arr2[i] == arr1[j] ) {
                    ans.add(arr1[j]);
                }
            }
        }
        
        for(int i = 0; i < arr1.length; i++){
            if (!ans.contains(arr1[i])) {
                ans.add(arr1[i]);
            }
        }

        int[] req = new int[arr1.length];

        for(int i = 0; i < ans.size(); i++){
            req[i] = ans.get(i);
        }

        return req;
    }
}
