package Hashing.SlidingWindow;

public class TaskSchedular {
    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B'};

        int n = 2;
        
        System.out.println(leastInterval(tasks, n));
    }

    public static int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];

        for(char ch : tasks){
            freq[ch - 'A']++;
        }

        int max = 0;

        for(int val : freq){
            if (val > max) {
                max = val;
            }
        }

        int maxCounts = 0;

        for(int val : freq){
            if (val == max) {
                maxCounts++;
            }
        }

        return Math.max(tasks.length,((max - 1) * (n + 1) + maxCounts));
    }
}