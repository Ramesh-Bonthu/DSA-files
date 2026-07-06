package BinarySearch.UpperLowerBound;

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 4, 19};
        int x = 4;
        System.out.println(findCeil(arr, x));
    }
    public static int findCeil(int[] arr, int x) {
        
        int s = 0;
        int e = arr.length - 1;

        if (x > arr[e]) {
            return -1;
        }

        if(x <= s){
            return 0;
        }

        int ans = -1;

        while (s < e) {
            int m = s + (e - s)/2;

            if(arr[m] == x){
                ans = m;
                e = m;
            }
            else if (arr[m] > x) {
                e = m;
            }else{
                s = m + 1;
            }
        }
        return ans != -1 ? ans : s;
    }
}
