package Strings;

public class CommonPrefixSum {
    public static void main(String[] args) {
        String[] str ={"dog","racecar","car"};
        System.out.println(commonPrefixSum(str));
        
    }
    static String commonPrefixSum(String[] str){
        int leastlen = str[0].length();

        for(String st : str){
            if (st.length() < leastlen) {
                leastlen = st.length();
            }
        }
        String check = "";

        for(int i = 0; i <= leastlen; i++){
            check = str[0].substring(0, i);
            for(int j = 1; j < str.length; j++){
                if (!check.equals(str[j].substring(0, i))) {
                    check = check.substring(0, i-1);
                    return check;
                }
            }
        }
        return check;
    }
}
