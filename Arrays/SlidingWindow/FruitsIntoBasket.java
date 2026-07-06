package Arrays.SlidingWindow;

import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2,1};
        System.out.println(totalFruit1(fruits));
    }

    public static int totalFruit1(int[] fruits) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;

        for(int r = 0; r < fruits.length; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left])==0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, r-left+1);
        }

        return max;
    }



    public static int totalFruit(int[] fruits) {
        int count = 0;
        int max = count;

        int a = fruits[0];
        int b = 0;

        for(int i = 1; i < fruits.length; i++){
            if (fruits[i] != a) {
                b = fruits[i];
                break;
            }
        }

        for(int i = 0; i < fruits.length; i++){
            if (fruits[i] == a || fruits[i] == b) {
                count++;
            }else{
                a = fruits[i-1];
                b = fruits[i];
                max = Math.max(count, max);
                count = 2;
            }
        }

        max = Math.max(count, max);

        return max;
    }
}
