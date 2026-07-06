package Training.Day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(nextLargerElement(arr));
    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.empty()) list.add(-1);
            else list.add(st.peek());

            st.push(arr[i]);
        }
        Collections.reverse(list);

        return list;
    }
}
