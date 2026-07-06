package Stack.Expression_Evulation;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {

        //System.out.println(Math.ceil(-11/3));
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static  int evalRPN(String[] tokens) {
        int ans  = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++){

            if (tokens[i].equals("+") || tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/") || tokens[i].equals("^")  ){
                int a = st.peek();
                st.pop();
                int b = st.peek();
                st.pop();
                int localAns = 0;
                if (tokens[i].equals("+")) {
                    localAns = a + b;
                }else if (tokens[i].equals("-")) {
                    localAns = b - a;
                }else if (tokens[i].equals("*")) {
                    localAns = a * b;
                }else if (tokens[i].equals("/")) {
                    localAns = b / a;
                }else if (tokens[i].equals("^")) {
                    localAns =(int) Math.pow(b, a);
                }

                st.push(localAns);
            }else{
                int val = Integer.parseInt(tokens[i]);

                st.push(val);
            }
        }

        ans = st.peek();

        return ans;
    }
}
