package BitWise;

public class FindXORSumWithAND {
    public static void main(String[] args) {
        int[] arr1 = {12};
        int[] arr2 = {4};
        System.out.println(getXORSum(arr1, arr2));
    }
    static int getXORSum(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] li = new int[m*n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                li[i] = arr1[i] & arr2[j];
            }
        }
        int result = 0;
        for(int l : li){
            result ^= l; 
        }
        return result;
    }
}
