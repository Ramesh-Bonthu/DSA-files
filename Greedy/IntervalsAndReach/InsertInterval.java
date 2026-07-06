package Greedy.IntervalsAndReach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

        int[][] intervals = {
            {1,3},
            {2,5}
        };

        int[] newInterval = {4,8};

        System.out.println(insert(intervals, newInterval));
        
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] ans = new int[n + 1][2];

        int index = 0;

        for(int i = 0; i < n; i++){
            if (intervals[i][0] < newInterval[0]) {
                index++;
            }else{
                break;
            }
        }

        for(int i = 0; i < n; i++){
            if (i < index) {
                ans[i] = intervals[i];
            }
            else if (i == index) {
                ans[i] = newInterval;
                ans[i + 1] = intervals[i]; 
            }else{
                ans[i + 1] = intervals[i];
            }
        }

        if (index == n) {
            ans[n] = newInterval;
        }

        List<List<Integer>> list = new ArrayList<>();
        int start = ans[0][0];
        int end = ans[0][1];

        for(int i = 1; i < ans.length; i++){
            if (ans[i][0] <= end) {
                end = ans[i][1] > end ? ans[i][1]: end;
            }else{
                list.add(Arrays.asList(start,end));
                start = ans[i][0];
                end = ans[i][1] > end ? ans[i][1]: end;
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

        for(int[] arr : array){
            System.out.println(Arrays.toString(arr));
        }

        return array;
    }
}
