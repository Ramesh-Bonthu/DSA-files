package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "RamaR";
        System.out.println(stringReverse(str));
    }
    static String stringReverse(String str){
        String revStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            revStr += str.charAt(i);
        }

        if (str.equals(revStr)) {
            System.out.println(str);
        }

        return revStr;
    }
}
