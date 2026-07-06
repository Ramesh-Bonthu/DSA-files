package ProblemOfTheDays;

public class Day8 {
    public static void main(String[] args) {
        String  s = "z*#";
        
        System.out.println(processStr(s));
    }

    public static String processStr(String s) {
        
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

        return sb.toString();

    }

}
