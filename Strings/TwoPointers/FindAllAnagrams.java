package Strings.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len = p.length();
        for(int i = 0; i <= s.length()-len; i++){
            String str = s.substring(i, i+len);
            Boolean val = true;
            for(int j = 0; j < len; j++){
                if (!p.contains(String.valueOf(str.charAt(j)))) {
                    val = false;
                    break;
                }
            }
            if(val) list.add(i);
        }
        
        return list;
    }
}
