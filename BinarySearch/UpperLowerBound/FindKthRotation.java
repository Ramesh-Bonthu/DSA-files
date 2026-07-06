package BinarySearch.UpperLowerBound;

public class FindKthRotation {
    public static void main(String[] args) {
        int[] arr = {6,9,3,4};
        System.out.println(findKRotation(arr));
    }

    public static  int findKRotation(int arr[]) {
        
        int s = 0;
        int e = arr.length - 1;

        if (arr[s] <= arr[e]) {
            return 0;
        }

        if (arr[s] > arr[s + 1]) {
            return 1;
        }

        while (s < e) {
            int m = s + (e - s)/2;

            if (m - 1 >= 0 && m + 1 < arr.length && arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
                return m;
            }else if(m - 1 >= 0 && arr[m] < arr[m - 1]){
                return m - 1;
            }else if(arr[m] < arr[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        
        return -1;
    }
}
