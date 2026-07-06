package Recursion;

public class DiceThrown {
    public static void main(String[] args) {
        int target = 4;
        String p = "";
        diceThrown(p, target);
    }
    static void diceThrown(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 & i <= target; i++){
            diceThrown(p+i, target-i);
        }
    }
}
