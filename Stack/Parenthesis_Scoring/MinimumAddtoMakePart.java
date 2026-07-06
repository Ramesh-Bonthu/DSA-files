package Stack.Parenthesis_Scoring;

import java.util.Stack;

public class MinimumAddtoMakePart {
    public static void main(String[] args) {
        String s = "(()))(";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();   
        
        for(char c : s.toCharArray()){

            if(!st.empty() && st.peek() == '(' && c == ')'){
                st.pop();
            }else{
                st.push(c);
            }
            
        }

        return st.size();
    }

}
