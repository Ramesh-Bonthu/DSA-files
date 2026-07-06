package Strings;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        
    }
    static int longestUniqueSubstring(String s) {
        int size = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = s.length();

        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            while (i <= j && map.get(s.charAt(j)) > 1) {
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            size = Math.max(size, j-i+1);
            j++; 
        }

        return size;
    }
}
