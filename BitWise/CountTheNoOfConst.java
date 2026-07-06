package BitWise;

public class CountTheNoOfConst {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countTheNoOfConst(allowed, words));
    }

    static int  countTheNoOfConst(String allowed, String[] words){
        int count = 0;

        for(int i = 0; i < words.length; i++){
            
            for(int j = 0; j < words[i].length(); j++){
                if (!(allowed.contains(words[i].charAt(j)+""))) {
                    break;
                }
                if(j==words[i].length()-1)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}
