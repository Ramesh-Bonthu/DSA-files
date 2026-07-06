package HashMap.SlidingWindow_Map;

import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        
    }
    public int totalElements(int[] arr) {
        int count = 0;
        int l = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int r = 0; r < arr.length; r++){
            map.put(arr[r], map.getOrDefault(arr[r],0)+1);

            while (map.size() > 2) {
                map.put(arr[l], map.get(arr[l])-1);

                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            count = Math.max(count, r-l+1);
        }

        return count;
    }
}
