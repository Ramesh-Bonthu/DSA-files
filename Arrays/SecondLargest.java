package Arrays;
public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { 10, 5, 10 };

    System.out.println(getSecondLargest(arr));
    /*int max = arr[0];
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
    */
  }

  static int getSecondLargest(int[] arr) {
        // code here
        int max1 = arr[0];
        int max2 = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] != max1 && arr[i] > max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
