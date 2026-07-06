package HashMap.FrequenceMap_Counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequents {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3};
        int k = 2;
        System.out.println(topKFrequent1(nums, k));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int small = Integer.MAX_VALUE;
        int i = 0;

        for(int key : map.keySet()){
            if (i < k) {
                ans[i] = key;
                i++;
                if (small == Integer.MAX_VALUE || map.get(key) < map.get(small)) {
                    small = key;
                }
            }else if (map.get(key) > map.get(small)) {
                for(int j = 0; j < k ; j++){
                    if (ans[j] == small) {
                        ans[j] = key;
                        small = ans[0];
                    }
                }

                for(int j = 1; j < k; j++){
                    if (map.get(ans[j]) < map.get(small)) {
                        small = ans[j];
                    }
                }
            }
        }

        return ans;
    }

    public static ArrayList<Integer> topKFrequent1(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int key : map.keySet()){

            if (pq.size() < k) {
                pq.add(key);
            }else if (map.get(key) > map.get(pq.peek())) {
                pq.poll();
                pq.add(key);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while (!pq.isEmpty()) {
            arr.add(pq.poll());
        }

        return arr;
    }
}
