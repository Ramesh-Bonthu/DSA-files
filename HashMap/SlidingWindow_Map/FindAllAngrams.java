package HashMap.SlidingWindow_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAngrams {
    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p =  "abc";

        System.out.println(findAnagrams1(s, p));
        
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = p.length();
        int l = 0;
        
        ArrayList<Character> arr = new ArrayList<>();

        for(char ch : p.toCharArray()){
            if (arr.contains(ch)) {
                n = n -1;
            }else{
                arr.add(ch);
            }
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if (!arr.contains(ch)) {
                map.clear();
                l = i+1;
            }else{

                if(map.size() < n || map.containsKey(ch)){
                    while (map.containsKey(ch)) {
                        map.remove(s.charAt(l));
                        l++;
                    }

                    map.put(ch, i);
                }if (map.size() == n){

                    ans.add(map.get(s.charAt(l)));

                }
            }
        }

        return ans;
    }
    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        // First window
        for (int i = 0; i < windowSize; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = windowSize; i < s.length(); i++) {

            // Add new char
            sCount[s.charAt(i) - 'a']++;

            // Remove old char
            sCount[s.charAt(i - windowSize) - 'a']--;

            // Compare
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
