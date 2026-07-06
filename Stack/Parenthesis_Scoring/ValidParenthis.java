package Stack.Parenthesis_Scoring;

import java.util.Stack;

public class ValidParenthis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                st.push(c);
            }else{
                if (c == ')') {
                    if (st.empty() || !(st.peek() == '(')) {
                        return false;
                    }
                    st.pop();
                }else if (c == ']') {
                    if (st.empty() || !(st.peek() == '[')) {
                        return false;
                    }
                    st.pop();
                }else{
                    if (st.empty() || !(st.peek() == '{')) {
                        return false;
                    }
                    st.pop();
                }
            }
        }

        return st.empty();
    }
}
