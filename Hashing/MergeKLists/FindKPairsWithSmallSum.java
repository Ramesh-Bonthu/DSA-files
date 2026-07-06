package Hashing.MergeKLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallSum {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};

        int k = 2;

        System.out.println(kSmallestPairs(nums1, nums2, k));
        
        
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(
            (a,b) -> {return a.get(0) - b.get(0);}
        );

        for(int val1 : nums1){
            for(int val2 : nums2){
                pq.add(new ArrayList<>(Arrays.asList(val1+val2,val1,val2)));
            }
        }

        int temp = 0;

        while (temp != k) {
            ans.add(pq.poll());
            ans.get(temp).remove(0);
            temp++;
        }

        
        return ans;
    }

    /*{
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {return a[0] - b[0];}
        );

        int[] a1 = new int[]{1,2};
        int[] a2 = new int[]{2,2};
        int[] a3 = new int[]{4,2};
        int[] a4 = new int[]{4,2};


        pq.add(a1);
        pq.add(a2);
        pq.add(a3);
        pq.add(a4);

        while (!pq.isEmpty()) {
            System.out.println(Arrays.toString(pq.poll()));
        }
    }*/
}
