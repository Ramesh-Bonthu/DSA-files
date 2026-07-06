package Searching;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {312884470};
        int hours = 312884469;
        //System.out.println((double)11/5);
        System.out.println(kokoEatingBananas(arr, hours));
    }

    static int kokoEatingBananas(int[] arr, int hours){
        
        
        int max = arr[0];

        for(int num: arr){
            max = Math.max(max, num);
        }
        int start = 1;
        int end = max;

        int ans = end;

        while (start <= end) {
           int  mid = start + (end - start)/2;

            long h = 0;

            for(int num : arr){
                h += (num + mid - 1)/mid;
            }
            if (h <= hours) {
                ans = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
