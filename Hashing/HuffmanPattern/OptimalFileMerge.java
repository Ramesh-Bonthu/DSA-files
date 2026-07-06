package Hashing.HuffmanPattern;

import java.util.PriorityQueue;

public class OptimalFileMerge {
    public static void main(String[] args) {
        
    }

    public static int minCost(int[] arr) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        while(pq.size() > 1){
            int a = pq.peek();
            pq.poll();
            int b = pq.peek();
            pq.poll();

            cost += (a+b);

            pq.add(a+b);
        }

        return cost; 
        
    }
}
