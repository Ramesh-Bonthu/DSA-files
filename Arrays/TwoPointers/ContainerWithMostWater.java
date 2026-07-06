package Arrays.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(containerWithMostWater(arr));
    }

    static int containerWithMostWater(int[] arr){
        int max = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int water = Math.min(arr[i], arr[j]) * (j-i);
            max = Math.max(max, water);
            if (arr[i] > arr[j]) {
                j--;
            }else{
                i++;
            }
        }

        return max;
    }
}
