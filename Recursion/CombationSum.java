package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = Helper(arr, target);
        System.out.println(result);
    }

    static List<List<Integer>> Helper(int[]arr,int target){
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        combSum(arr, target, 0, path,result);
        return result;
    }

    static void combSum(int[] arr,int target,int index,List<Integer> path,List<List<Integer>> result){
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (target < 0) {
            return;
        }

        for(int i = index; i < arr.length; i++){
            path.add(arr[i]);
            combSum(arr, target-arr[i], i , path,result);
            path.remove(path.size()-1);
        }
        
    }
}
