package ProblemOfTheDays;

import java.util.HashMap;

public class Day5 {
    public static void main(String[] args) {

        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        
        HashMap<Integer,Character> alpha = new HashMap<>(); 

        int j = 25;
        for(int i = 0; i < 26; i++){
            alpha.put(i, (char)('a' + j--));
        }

        HashMap<Character,Integer> weightArr = new HashMap<>(); 

        for(int i = 0; i <= 25; i++){
            weightArr.put((char)('a' + i),weights[i]);
        }


        StringBuilder sb = new StringBuilder();

        for(String str : words){

            int sum = 0;

            for(char c : str.toCharArray()){
                sum += weightArr.get(c);
            }

            int mod = sum % 26;

            sb.append(alpha.get(mod));
        }

        return sb.toString();
    }
}
