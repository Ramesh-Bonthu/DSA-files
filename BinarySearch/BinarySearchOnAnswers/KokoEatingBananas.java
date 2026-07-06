package BinarySearch.BinarySearchOnAnswers;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20};
        int k = 7;
        System.out.println(kokoEat(arr, k));
    }

    public static int kokoEat(int[] arr, int k) {
        int ans = 0;
        
        int l = 1;
        int r = arr[0];

        for(int i = 1; i < arr.length; i++){
            r = Math.max(r, arr[i]);
        }

        while(l <= r){
            int m = l + (r - l)/2;

            if(isSafe(arr,m,k)){
                ans = m;
                r = m - 1;
            }else{
                l = m + 1;
            }
        }

        return ans;
    }

    public static boolean isSafe(int[] arr, int m, int k){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            count += arr[i]/m;

            if(arr[i] % m != 0) count++;
        }

        if (count <= k) {
            return true;
        }

        return false;
    }
}
