package BinarySearch.UpperLowerBound;


public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        System.out.println(find(arr, x));
    }
    public static int find(int arr[], int x) {
        
        int s = 0;
        int e = arr.length - 1;

        int firstPos = firstPostion(arr, x, s, e);

        if(firstPos == -1){
            return 0;
        }

        int secondPos = secondPostion(arr, x, s, e);

        return secondPos - firstPos + 1;
    }

    public static int firstPostion(int[] arr, int x, int s, int e){

        int ans = -1;

        while (s <= e) {
            int m = s + (e - s)/2;

            if (arr[m] == x) {
                ans = m;
                e = m - 1;
            }else if (arr[m] < x) {
                s = m + 1;
            }else{
                e = m - 1;
            }

        }


        return ans;
    }

    public static int secondPostion(int[] arr, int x, int s, int e){

        int ans = -1;

        while (s <= e) {
            int m = s + (e - s)/2;

            if (arr[m] == x) {
                ans = m;
                s = m + 1;
            }else if (arr[m] < x) {
                s = m + 1;
            }else{
                e = m - 1;
            }

        }


        return ans;
    }
}
