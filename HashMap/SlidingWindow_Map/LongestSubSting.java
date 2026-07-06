package HashMap.SlidingWindow_Map;

import java.util.ArrayList;

public class LongestSubSting {
    public static void main(String[] args) {

        String str = "pwwake";

        System.out.println(longestSubString(str));
        
    }

    public static int longestSubString(String str){
        int count = 0;
        
        ArrayList<Character> arr = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (arr.contains(ch)) {
                int n = arr.size();
                for(int j = 0; j < n; j++){

                    if(arr.get(0) != ch){
                        arr.remove(0);
                    }else{
                        arr.remove(0);
                        break;
                    }

                }
            }

            arr.add(ch);

            count = Math.max(count, arr.size());
        }

        return count;
    }
}
