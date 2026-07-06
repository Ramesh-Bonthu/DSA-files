package Backtracking.ChoiceBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSumComb {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        solve(arr, 0, target, curr, ans);

        return ans;
    }

    public static void solve(int[] arr,int ind,int tar,List<Integer> curr,List<List<Integer>> ans){
        
        if(tar == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(ind >= arr.length) return;

        if(arr[ind] <= tar){
            curr.add(arr[ind]);
            solve(arr, ind, tar - arr[ind], curr, ans);
            curr.remove(curr.size() - 1);
        }

        while (ind + 1 < arr.length && arr[ind] == arr[ind + 1]) {
            ind++;
        }

        solve(arr, ind+1, tar, curr, ans);
    }
}
