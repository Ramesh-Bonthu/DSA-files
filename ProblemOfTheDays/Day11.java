package ProblemOfTheDays;

public class Day11 {
    public static void main(String[] args) {
        
    }

    public int largestAltitude(int[] gain) {
        int max = 0;
        
        int prefixsum = 0;

        for(int g : gain){
            prefixsum += g;
            max = Math.max(max, prefixsum);
        }

        return max;
    }
}
