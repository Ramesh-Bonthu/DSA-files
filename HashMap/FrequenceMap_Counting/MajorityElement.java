package HashMap.FrequenceMap_Counting;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,13};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int arr[]) {
        int size = arr.length / 2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int val : map.keySet()){
            if (map.get(val) > size) {
                return val;
            }
        }
        
        return -1;
    }
}
