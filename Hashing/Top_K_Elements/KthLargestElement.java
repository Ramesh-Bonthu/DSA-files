package Hashing.Top_K_Elements;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr, k));
    }
    public static int findKthLargest(int[] arr, int k) {
        int val = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ar : arr){
            pq.add(ar);
        }

        int count = 0;

        while (count != k) {
            val = pq.poll();
            count++;
        }



        return val;
    }
}
