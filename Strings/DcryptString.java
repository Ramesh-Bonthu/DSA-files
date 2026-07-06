package Strings;
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
public class DcryptString {
    public static void main(String[] args) {
        String s = "10#11#26#";
        System.out.println(dcryptString(s));
        //System.out.println((char)((Integer.parseInt("1") + 48)+48));
        //System.out.println(Integer.parseInt("1"));
    }

    static String dcryptString(String s){
        StringBuilder sb = new StringBuilder();


        int i = 0;

        while (i < s.length()) {
            if (i+2 < s.length() &&s.charAt(i+2)=='#') {
                String su = s.substring(i, i+2);
                sb.append((char)((Integer.parseInt(su) + 48)+48));
                i += 3;
            }else{
                sb.append((char)(s.charAt(i)+48));
                i++;
            }
        }


        return sb.toString();
    }
}
