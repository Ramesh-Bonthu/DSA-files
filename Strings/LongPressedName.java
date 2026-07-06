package Strings;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "xnhtq";
        String typed = "xhhttqq";
        System.out.println(longPressedName(name, typed));
    }

    static boolean longPressedName(String name, String typed){

        int i = 0;
        int j = 0;

        while(j < typed.length()){
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)) {
                j++;
            }else{
                return false;
            }
        }
        
        return i == name.length();
    }
}
