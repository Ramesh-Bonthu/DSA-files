package Hashing.Top_K_Elements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequents {
    public static void main(String[] args) {
        
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(map, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                return map.get(a) - map.get(b);
            }
        );

        for( int key : map.keySet()){
            pq.add(key);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        for(int i = k; i >=0 ; i--){
            ans[i] = pq.poll();
        }
        
        return ans;
    }
}
