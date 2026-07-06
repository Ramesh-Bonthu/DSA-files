package Stack.Stack_Simulation;

import java.util.Stack;

public class RemoveAllAdjcentDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        
        char prev = '0';

        for(char c : s.toCharArray()){
            
            if (c == prev) {
                continue;
            }


            if (!st.empty() && st.peek() == c) {
                while (!st.empty() && st.peek() == c) {
                    st.pop();
                }

                prev = c;
            }else{
                st.push(c);
            }            
        }

        StringBuilder sb = new StringBuilder();

        while(!st.empty()){
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();
    }

    public static String removeUtil(String s) {
        
        StringBuilder sb = new StringBuilder();

        int len = s.length();

        int n = len;

        for(int i = 0; i < n; i++){
            if (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                while (i < n - 1 && s.charAt(i) == s.charAt(i+1)) {
                    i++;
                }
            }else{
                sb.append(s.charAt(i));
            }
        }

        String result =  sb.toString();
        
        if (result.length() != len) {
            return removeUtil(result);
        }

        // Return the final string with no adjacent duplicates.
        return result;
    }
}
