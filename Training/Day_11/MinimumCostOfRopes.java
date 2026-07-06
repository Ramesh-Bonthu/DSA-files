package Training.Day_11;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public static void main(String[] args) {
        int[] arr = {4,2,3,6};
        System.out.println(minCost(arr));
    }
    public static int minCost(int[] arr) {
        // code here
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
