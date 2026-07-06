package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(lengthOfLastWord(str));
        
    }

    static int lengthOfLastWord(String str){
        String[] strSplit = str.split(" ");
        return strSplit[strSplit.length - 1].length();
    }
}
