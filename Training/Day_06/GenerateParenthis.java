package Training.Day_06;

import java.util.ArrayList;

public class GenerateParenthis {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<String> ans = new ArrayList<>();
        solve(n/2, n/2, "",ans);
        System.out.println(ans);
    }
    public static void solve(int open, int close, String s,ArrayList<String> ans){
        if(open == 0 && close == 0){
            ans.add(s);
            return;   
        }

        if(open > 0){
            solve(open-1, close, s + "(", ans);
        }
        if(open < close){
            solve(open, close-1, s + ")", ans);
        }
    }
}
