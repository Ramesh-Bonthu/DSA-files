package Strings.TwoPointers;

public class LongestPailndromicSuStr {
    public static void main(String[] args) {
        String s = "abbd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int idx = -1;
        int len = 0;

        int n = s.length();

        for(int i = 0; i < n; i++){
            int r = i + 1;

            while(r < n && s.charAt(i)== s.charAt(r)){
                r++;
            }

            int l = i - 1;

            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--; r++;
            }

            int curr = r - l - 1; 

            if(curr > len){
                len = curr;
                idx = l + 1;
            }
        }

        return s.substring(idx,idx + len);
    }
}
