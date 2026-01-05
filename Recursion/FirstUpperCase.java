package Recursion;
// https://www.geeksforgeeks.org/dsa/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "geeKs";
        System.out.println(firstUpperCase(str, 0));
    }
    static String firstUpperCase(String str,int i){
        if (str.charAt(i) == '\0' ) {
            return "null";
        }
        if (Character.isUpperCase(str.charAt(i))) {
            return String.valueOf(str.charAt(i));
        }
        return firstUpperCase(str, ++i);
    }
}
