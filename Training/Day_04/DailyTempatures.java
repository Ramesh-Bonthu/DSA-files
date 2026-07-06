package Training.Day_04;

import java.util.Arrays;
import java.util.Stack;

public class DailyTempatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while (!st.empty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (st.empty()) ans[i] = 0;
            else ans[i] = st.peek() - i;

            st.push(i);
        }

        return ans;
    }
}

