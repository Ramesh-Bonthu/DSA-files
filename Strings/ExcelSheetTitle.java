package Strings;

public class ExcelSheetTitle {
    public static void main(String[] args) {
        int num = 28;
        //char var = (char)((num % 26) + 'A');
        //System.out.println(var);
        //String name = Integer.toString(num);
        System.out.println(excelSheetTitle(num));
    }

    static String excelSheetTitle(int num){

        StringBuilder ans = new StringBuilder();

        while (!(num == 0)) {
            num--;
            char var = (char)((num % 26) + 'A');
            ans.append(var);
            num /= 26;
        }
        return ans.reverse().toString();
    }
}
