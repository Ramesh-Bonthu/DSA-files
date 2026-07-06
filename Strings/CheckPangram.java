package Strings;

public class CheckPangram {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(checkPangram(str));

    }

    static boolean checkPangram(String str){
        boolean[] seen = new boolean[26];


        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                seen[ch-'a'] = true;
            }

        }

        for(boolean b : seen){
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
