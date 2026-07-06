package Stack.Stack_Simulation;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '#') {
                if(!st.empty()){
                    st.pop();
                }   
            }else{
                st.push(c);
            }
        }

        StringBuffer sb = new StringBuffer();

        for(char c : st){
            sb.append(c);
        }

        Stack<Character> st1 = new Stack<>();

        for(char c : t.toCharArray()){
            if (c == '#') {
                if(!st1.empty()){
                    st1.pop();
                }   
            }else{
                st1.push(c);
            }
        }

        StringBuffer tb = new StringBuffer();

        for(char c : st1){
            tb.append(c);
        }

        return sb.toString().equals(tb.toString());
        

    }
}
