package Stack.Recursive_Stack;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> revSt = new Stack<>();

        while (!st.empty()) {
            revSt.push(st.pop());
        }

        revSt.push(x);

        while (!revSt.empty()) {
            st.push(revSt.pop());
        }

        return st;
    }
}
