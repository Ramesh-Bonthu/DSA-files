package Recursion;
// https://leetcode.com/problems/permutations/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsLeetcode2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> arr = new ArrayList<>();
        for(int num : nums){
            arr.add(num);
        }
        List<Integer> req = new ArrayList<>();
        System.out.println(permutations(req, arr));
        
    }

    static List<List<Integer>> permutations(List<Integer> req,List<Integer> arr){
        if (arr.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>(Arrays.asList(req));
            return ans;
        }

        int ele = arr.get(0);

        List<List<Integer>> ansReq = new ArrayList<>();

        for(int i = 0; i <= req.size(); i++){
            List<Integer> first = req.subList(0, i);
            List<Integer> second = req.subList(i, req.size());
            List<Integer> required = new ArrayList<Integer>();
            required.addAll(first);
            required.add(ele);
            required.addAll(second);
            ansReq.addAll(permutations(required, arr.subList(1,arr.size())));
        }
        return ansReq;
    }
}
