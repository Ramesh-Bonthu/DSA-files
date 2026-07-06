package Stack.Monotonic_Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        int n = arr.length - 1;
        for(int i = n; i >= 0; i--){
            while (!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.empty()) {
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }

            st.push(arr[i]);
        }

        Collections.reverse(ans);

        return ans;
    }

    public static int[] nextGreaterElements(int[] nums1, int[] nums) {
        int n = nums.length;
        int[] nextGreater = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = n; i >= 0; i--){
            while (!st.empty() && nums[i] >= st.peek()) {
                st.pop();
            }

            if (st.empty()) {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = st.peek();
            }

            st.push(nums[i]);
        }

        int[] ans = new int[nums1.length];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i],nextGreater[i]);
        }

        for(int i = 0; i < ans.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        Stack<Integer> st = new Stack<>();

        for(int i = n; i >= 0; i--){
            while (!st.empty() && nums[i] >= st.peek()) {
                st.pop();
            }

            if (st.empty()) {
                map.put(nums[i], -1);
            }else{
                map.put(nums[i], st.peek());
            }

            st.push(nums[i]);
        }

        int[] ans = new int[nums1.length];


        for(int i = 0; i < ans.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

