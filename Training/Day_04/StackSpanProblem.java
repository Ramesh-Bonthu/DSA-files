package Training.Day_04;

import java.util.ArrayList;
import java.util.Stack;

public class StackSpanProblem {
    public static void main(String[] args) {
        int[] arr = {100, 80, 90, 120};
        System.out.println(calculateSpan(arr));
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.empty()) list.add(i+1);
            else list.add(i - st.peek());

            st.push(i);
        }
        
        return list;
    }
}
