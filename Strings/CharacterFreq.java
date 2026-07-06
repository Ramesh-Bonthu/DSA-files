package Strings;

import java.util.HashMap;


public class CharacterFreq {
    public static void main(String[] args) {
        String str = "aabc";
        int freq = 2;
        System.out.println(characterFreq1(str,freq));
    }

    static int characterFreq(String str,int freq) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            /*if (!(map.containsKey(ch))) {
                map.put(ch, 1);
            } else {
                int val = map.get(ch);
                map.put(ch, ++val);
            }*/
           map.put(ch,map.getOrDefault(ch, 0)+ 1);
        }

        for (char ch:map.keySet()) {
            if (map.get(ch) == freq) {
                count++;
            }
        }

        return count;
    }
    static int characterFreq1(String str,int freq) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        
        int i = 0;
        
        while (i < str.length()) {
            char ch = str.charAt(i);
            
           map.put(ch,map.getOrDefault(ch, 0)+ 1);
           
           while (i < str.length()  && str.charAt(i) == ch) {
                i++;
           }
        }
        
        for(int val : map.values()){
            if (val == freq) {
                count++;
            }
        }

        return count;
    }
}
