package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] arr = {{2,3},{4,5},{6,7},{8,9},{1,10},{2,13},{14,16}};

        int[][] array = mergeInterval(arr);
        for(int[] arr1 : array){
            System.out.println(Arrays.toString(arr1));
        }
    }

    static int[][] mergeInterval(int[][] arr){
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);    

        List<List<Integer>> list = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];

        for(int i = 1; i < arr.length; i++){
            if (arr[i][0] <= end) {
                end = arr[i][1] > end ? arr[i][1]: end;
            }else{
                list.add(Arrays.asList(start,end));
                start = arr[i][0];
                end = arr[i][1] > end ? arr[i][1]: end;
            }
        }
        list.add(Arrays.asList(start,end));

        int rows = list.size();
        int cols = list.get(0).size(); 
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                array[i][j] = list.get(i).get(j);
            }
        }

        return array;
    }
}
