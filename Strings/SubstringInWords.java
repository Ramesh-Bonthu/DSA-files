
package Strings;


///https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

public class SubstringInWords {
    public static void main(String[] args) {
        String s = "aaaaaaabbbbbbb";
        String[] str = {"a","b","c"};
        System.out.println(substringInWords(s, str));
    }

    static int substringInWords(String s, String[] str){

        int count = 0;

        for(int i = 0; i < str.length; i++){
            if(s.contains(str[i])) {
                count++;
            }
        }

        return count;
    }
}
