package Arrays;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 6, 6, 6, 6, 123, 125};
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(firstAndLastOccurence(arr, 0, arr.length - 1, 6));
        ans.add(firstAndLastOccurence1(arr, 0, arr.length - 1, 6));

        System.out.println(ans);
    }

    static int firstAndLastOccurence(int[] arr,int start,int end,int target){
        
        int mid = start + (end - start)/2;

        if (start == end) {
            return end;
        }
        if (arr[mid] == target || arr[mid] > target) {
            return firstAndLastOccurence(arr, start, mid, target);
        }
        return firstAndLastOccurence(arr,mid + 1, end, target);
    }

    static int firstAndLastOccurence1(int[] arr,int start,int end,int target){
        
        int mid = start + (end - start)/2;

        if (start == end) {
            return end;
        }
        if (arr[mid] == target || arr[mid] < target) {
            return firstAndLastOccurence1(arr, mid, end, target);
        }
        return firstAndLastOccurence1(arr,start, mid-1, target);
    }
}

