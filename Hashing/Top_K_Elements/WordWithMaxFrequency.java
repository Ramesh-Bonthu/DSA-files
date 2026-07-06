package Hashing.Top_K_Elements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class WordWithMaxFrequency {
    public static void main(String[] args) {
        String s = "hmk whj z u u fkh p jbs jhw dtw l p ";

        System.out.println(maximumFrequency(s));
    }

    public static String maximumFrequency(String s) {
        String[] str = s.split(" ");

        HashMap<String,Integer> map  = new HashMap<>();

        for(String st : str){
            map.put(st, map.getOrDefault(st, 0) + 1);
        }

        boolean check = true;

        int val = map.get(str[0]);

        for(String key :map.keySet()){
            if(map.get(key) != val){
                check = false;
                break;
            }
        }

        if (check) {
            return str[0] + " " + map.get(str[0]);
        }
        
        

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> {return map.get(a) - map.get(b);}
        );

        String ans = "";

        for(String key :map.keySet()){
            pq.add(key);

            if (pq.size() > 1) {
                pq.poll();
            }
        }

        ans = pq.poll();

        ans = ans + " " + map.get(ans);

        return ans;
    }
}
