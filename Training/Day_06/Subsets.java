package Training.Day_06;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int n  = arr.length;
        slove(arr, 0, n, temp, ans);
        return ans;
    }

    public static void slove(int[] arr, int i, int n, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(i == n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        slove(arr, i+1, n, temp, ans);
        temp.remove(temp.size()-1);

        slove(arr, i+1, n, temp, ans);
    }
}