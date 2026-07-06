package Stack.Expression_Evulation;

import java.util.Stack;

public class DecodeTheString {
    public static void main(String[] args) {
        String s = "3[ca]";
        System.out.println(decodeString(s));
    }   
    public static String decodeString(String s) {
        StringBuffer sb = new StringBuffer();

        char[] arr = s.toCharArray();

        Stack<String> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if (arr[i] != ']') {
                st.push(String.valueOf(arr[i]));
            }else{
                StringBuffer inSb = new StringBuffer();
                while (!st.peek().equals("[")) {
                    inSb.append(st.peek());
                    st.pop();
                }

                st.pop();

                StringBuffer inSb1 = new StringBuffer();

                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    num.insert(0, st.pop());
                }

                int val = Integer.parseInt(num.toString());

                for(int j = 0; j < val; j++){
                    inSb1.append(inSb);
                }

                st.push(inSb1.toString());
            }
        }
        
        while(!st.empty()){
            sb.append(st.peek());
            st.pop();
        }

        return sb.reverse().toString();
    }
}
