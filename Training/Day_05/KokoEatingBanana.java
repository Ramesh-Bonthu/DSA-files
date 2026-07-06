package Training.Day_05;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] arr={5,10,3};
        int k = 4;
        System.out.println(kokoEat(arr, k)); 
    }
    public static int kokoEat(int[] arr, int k) {
        int ans = 0;
        int l = 1;
        int r = arr[0];
        for(int n : arr){
            r = Math.max(n, r);
        }

        while(l <= r){
            int mid = l + (r - l)/2;

            if(isSafe(arr,k,mid)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

    static Boolean isSafe(int[] arr, int k, int s){
        int h = 0;

        for(int i = 0; i < arr.length; i++){
            h += (arr[i]/s);

            if(arr[i]%s != 0) h++;
            
        }

        if(h <= k) return true;
        return false;
    }
}
