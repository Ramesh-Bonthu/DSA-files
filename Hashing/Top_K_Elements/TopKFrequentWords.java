package Hashing.Top_K_Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println(topKFrequent(words, k));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        
        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b)->{
                if(map.get(a).equals(map.get(b))){
                    return b.compareTo(a);
                }
                return map.get(a) - map.get(b);
            }
        );

        for(String key : map.keySet()){
            pq.add(key);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}
