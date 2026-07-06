package BinarySearch.ClassicBS;

public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int binarysearch(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e-s)/2;

            if (arr[m] == k) {
                ans =  m;
                e = m - 1;
            }
            else if (arr[m] < k) {
                s = m + 1;
            }else{
                e = m - 1;
            }
        }

        return ans;
        
    }
}
