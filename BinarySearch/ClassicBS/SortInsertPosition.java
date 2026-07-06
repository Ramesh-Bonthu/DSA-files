package BinarySearch.ClassicBS;

public class SortInsertPosition {
    public static void main(String[] args) {
        
    }
    public static  int searchInsertK(int arr[], int k) {
        int ans = 0;

        int s = 0;
        int e = arr.length - 1;

        if (arr[e] < k) {
            return e + 1;
        }

        if(arr[s] >= k) return s;

        while(s <= e){
            int m = s + (e - s)/2;

            if (arr[m] < k) {
                ans = m;
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        
        return ans + 1;
    }
}
