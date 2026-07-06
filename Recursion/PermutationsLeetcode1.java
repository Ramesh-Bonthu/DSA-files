package Recursion;
// https://leetcode.com/problems/permutation-sequence/description/
import java.util.ArrayList;
import java.util.Collections;

public class PermutationsLeetcode1 {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        System.out.println(permutation(n, k));
    }

    static String permString(int n, int k){
        String str = "";

        for(int i = 1; i <= n; i++){
            str += i;
        }
        ArrayList<String> ans = new ArrayList<>();

        ans = permutations("", str);

        Collections.sort(ans);

        return ans.get(k-1);
        
    }

    static ArrayList<String> permutations(String p,String str){
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = str.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations(f+ch+s, str.substring(1)));
        }

        return ans;
    }

    static String permutation(int n, int k){

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            numbers.add(i);
        } 
        
        int[] fact = new int[n];

        fact[0] = 1;

        for(int i = 1; i < n; i++){
            fact[i] = fact[i-1] * i;
        }

        k--;

        StringBuilder ans = new StringBuilder();

        for(int i = n; i > 0; i--){
            int index = k / fact[i-1];
            ans.append(numbers.get(index));
            numbers.remove(index);
            k = k % fact[i-1];
        }
        
        
        return ans.toString();
    }

}
