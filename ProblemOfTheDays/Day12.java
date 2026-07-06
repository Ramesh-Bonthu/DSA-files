package ProblemOfTheDays;

import java.util.PriorityQueue;

public class Day12 {
    public static void main(String[] args) {
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;

        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : costs){
            pq.add(i);
        }

        int count = 0;

        while(!pq.isEmpty() && coins - pq.peek() >= 0){
            coins -= pq.poll();
            count++;
        }

        return count;
    }
}
