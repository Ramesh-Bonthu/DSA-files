package Strings;

import java.util.Arrays;

public class ReverseOfString3 {
    public static void main(String[] args) {

        String str = "i am student";

        StringBuilder reqStr = new StringBuilder();

        String[] splited = str.split(" ");

        for(int i = 0; i < splited.length; i++){
            splited[i] = new StringBuilder(splited[i]).reverse().toString();
            reqStr.append(splited[i] + " ");
        }



        System.out.println(Arrays.toString(splited));

        System.out.println(reqStr.toString().substring(0, reqStr.length()-1));
        
    }
}
