package Arrays;

import java.util.ArrayList;


public class PrefixSumRangeQuery {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        int[][] queries = {{0,1},{2,3}}; 
        ArrayList<Integer> ans = prefixSumRangeQuery(arr, queries);
        System.out.println(ans);
    }
    static ArrayList<Integer> prefixSumRangeQuery(int[] arr, int[][] queries){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int j = 0; j < queries.length; j++){
            int sum = 0;
            for(int i = queries[j][0]; i <= queries[j][1]; i++){
                sum += arr[i];
            }
            ans.add(sum);
        }

        return ans;
    }
}
