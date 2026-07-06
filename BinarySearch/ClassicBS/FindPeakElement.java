package BinarySearch.ClassicBS;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {-2,18,-16,25,24,5,-1,-2,-15};
        System.out.println(peakElement(arr));
    }
    public  static int peakElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int n = arr.length;

        if(e == 0) return s;

        if(arr[0] > arr[1]) return 0;

        if(arr[n-1] > arr[n - 2]) return n - 1;

        while (s < e) {
            int m = s + (e - s)/2;

            if (m - 1 >= 0 && m + 1 <= n && arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
                return m;
            }else if(arr[m-1] > arr[m] && arr[m] > arr[m + 1]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }

        return s;
        
    }
}
