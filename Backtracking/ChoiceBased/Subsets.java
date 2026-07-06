package Backtracking.ChoiceBased;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        solve(0, nums, curr, ans);

        return ans;

    }

    public static void solve(int index, int[] nums, List<Integer> curr,List<List<Integer>> ans){
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // take
        curr.add(nums[index]);
        solve(index + 1, nums, curr, ans);
        curr.remove(curr.size() - 1);

        // not take
        solve(index + 1, nums, curr, ans);
    }
}
