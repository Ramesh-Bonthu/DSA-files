package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Ramar";
        System.out.println(palindromeString(str));
    }
    static boolean palindromeString(String str){
        int len = str.length() - 1;

        int i = 0;

        while (i < len) {
            if (!(str.charAt(i) == str.charAt(len))) return false;
            i++;
            len--;
        }

        
        return true;
    }
}
