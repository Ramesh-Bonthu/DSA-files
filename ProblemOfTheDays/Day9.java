package ProblemOfTheDays;

public class Day9 {
    public static void main(String[] args) {
        String  s = "z*#";
        int k = 0;
        System.out.println(processStr(s, k));
    }

    public static char processStr(String s, long k) {
        StringBuffer sb = new StringBuffer();

        for(char c : s.toCharArray()){

            if (c == '#') {
                String st = sb.toString();
                sb.append(st);
            }else if (c == '%') {
                sb.reverse();
            }else if (c == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);   
                }
            }else{
                sb.append(c);
            }
        }

        return sb.isEmpty() ? '.' : sb.charAt((int)k);
   
    }
}
