package Stack.Monotonic_Stack;

import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        
    }
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 2 * n - 1; i >= 0; i--){
            int index = i % n;

            while (!st.empty() && nums[index] >= st.peek()) {
                st.pop();
            }

            if (st.empty()) {
                ans[index] = -1;
            }else{
                ans[index] = st.peek();
            }

            st.push(nums[index]);
        }

        

        return ans;
    }
}
