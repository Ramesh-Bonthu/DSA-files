package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,9,11};
        System.out.println(binarySearch(arr, 0, arr.length-1, 9));
    }
    static int binarySearch(int[] arr, int start,int end,int target){
        int mid = start + (end - start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            binarySearch(arr, start, end-1, target);
        }
        return binarySearch(arr, start+1, end, target);
    }
}
