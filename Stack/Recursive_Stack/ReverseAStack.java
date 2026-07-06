package Stack.Recursive_Stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        
    }
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> revSt1 = new Stack<>();

        while (!st.empty()) {
            revSt1.push(st.pop());
        }

        Stack<Integer> revSt2 = new Stack<>();

        while (!revSt1.empty()) {
            revSt2.push(revSt1.pop());
        }

        while (!revSt2.empty()) {
            st.push(revSt2.pop());
        }
    }

    public static void reverseStack1(Stack<Integer> st) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(!st.empty()){
            arr.add(st.pop());
        }

        for(int i = 0; i < arr.size(); i++){
            st.push(arr.get(i));
        }
    }
}
