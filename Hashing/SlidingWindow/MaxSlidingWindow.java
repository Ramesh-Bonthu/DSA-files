package Hashing.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
        
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        
        int index = 0;

        for(int i = 0; i < n; i++){

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.add(i);

            if (i >= k - 1) {
                ans[index++] = nums[dq.peekFirst()];
            }

        }

        return ans;
    }
}
