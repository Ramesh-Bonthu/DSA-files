package Training.Day_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermutataionsOfString {
    public static void main(String[] args) {
        String s = "kk";
        Set<String> ans = new HashSet<>();
        char[] arr = s.toCharArray();
        solve(arr, 0, ans);
        ArrayList<String> answer = new ArrayList<>(ans);
        System.out.println(answer);
    }

    public static void solve(char[] arr,int ind,Set<String> ans){
        if (ind >= arr.length) {
            ans.add(new String(arr));
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(arr,i,ind);
            solve(arr, ind+1, ans);
            swap(arr,i,ind);
        }
    }

    public static void swap(char[] arr,int i, int j){
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }
}