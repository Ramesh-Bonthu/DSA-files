package ProblemOfTheDays;

import java.util.HashMap;

public class Day13 {
    public static void main(String[] args) {
        
    }

    public int maxNumberOfBalloons(String text) {
        
        String s = "balloon";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : text.toCharArray()){

            if (s.indexOf(c) != -1) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        if (map.containsKey('l')) {
            map.put('l', map.get('l')/2);
        }

        if (map.containsKey('o')) {
            map.put('o', map.get('o')/2);
        }

        int min = Integer.MAX_VALUE;

        for(char c : map.keySet()){
            min = Math.min(min, map.get(c));
        }

        return min;
    }
}
