package Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "GEEKS";
        System.out.println(lengthOfString(str));
    }
    static int lengthOfString(String str){
        if (str.equals("")) {
            return 0;
        }
        return  1 + lengthOfString(str.substring(1));
    }
}
