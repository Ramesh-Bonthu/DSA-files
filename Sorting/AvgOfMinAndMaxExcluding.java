package Sorting;

public class AvgOfMinAndMaxExcluding {
    public static void main(String[] args) {
        int[] arr = {2000,3000,1000};
        System.out.println(avgOfMinAndMaxExcluding(arr));
        
    }

    static double avgOfMinAndMaxExcluding(int[] arr){
        double max = arr[0];
        double min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == max || arr[i] == min) {
                continue;
            }
            sum += arr[i];
            count++;
        }

        return sum / +count;
    }
}
