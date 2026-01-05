package Arrays;
public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 2, 1 };
    int max = arr[0];
    int max1 = 0;
    int max2 = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max2 = max1;
        max1 = max;
        max = arr[i];
      } else if (arr[i] < max && arr[i] > max1) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] < max1 && arr[i] > max2) {
        max2 = arr[i];
      }
    }

    System.out.println(max + " " + max1 + " " + max2);
  }
}
