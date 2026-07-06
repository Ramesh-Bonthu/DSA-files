package Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int n = 10;
        int[][] arr = {{1,5,3},{4,8,7},{6,9,1}};
        System.out.println(arrayManipulation(arr,n));
        
    }
    static long arrayManipulation(int[][] arr, int n){
        int[] list = new int[n+1];
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i][0]; j <= arr[i][1]; j++){
                list[j] += arr[i][2];
            }
        }
        long max = list[0];
        for(int m : list){
            if (m > max) {
                max = m;
            }
        }

        return max;
    }
}
