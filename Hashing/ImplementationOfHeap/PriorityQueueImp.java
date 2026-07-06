package Hashing.ImplementationOfHeap;

import java.util.PriorityQueue;

public class PriorityQueueImp {
    public static void main(String[] args) {
        
    }
    static void insert(PriorityQueue<Integer> q, int k) {

        // Your code here
        
        q.add(k);

        // Just insert k in q and don't return anything
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {

        
        // Your code here

        return q.contains(k);

        // If k is in q return true else return false
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        

        // Your code here

        return q.poll();
        // Delete the max element from q. The priority queue property might be useful
        // here
    }
}
