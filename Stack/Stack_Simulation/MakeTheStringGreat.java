package Stack.Stack_Simulation;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            boolean t = Character.isLowerCase(c);

            if (!st.empty() && t && st.peek() == Character.toUpperCase(c)) {
                st.pop();
            }else if (!st.empty() && !t && st.peek() == Character.toLowerCase(c)) {
                st.pop();
            }else{
                st.push(c);
            }
        }

        StringBuffer sb = new StringBuffer();

        while (!st.empty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
