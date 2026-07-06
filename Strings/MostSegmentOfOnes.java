package Strings;

public class MostSegmentOfOnes {
    public static void main(String[] args) {

        String str = "1111";
        System.out.println(mostSegmentOfOnes(str));
        
    }

    static boolean mostSegmentOfOnes(String str){
        
        int count = 0;

        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(i-1)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

       return true;
    }
}
