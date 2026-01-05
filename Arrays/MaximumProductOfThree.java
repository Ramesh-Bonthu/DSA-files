package Arrays;
public class MaximumProductOfThree {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 1, 5, 6 };
    System.out.println(ProductThree(arr));
  }

  static int ProductThree(int[] arr) {
    int product = 1;
    for (int i = 0; i < 3; i++) {
      product *= arr[i];
    }
    int maxProduct = product;
    for (int i = 3; i < arr.length; i++) {
      product /= arr[i - 3];
      product *= arr[i];
      if (product <= maxProduct) {
        product = maxProduct;
      } else if (product > maxProduct) {
        maxProduct = product;
      }
    }
    return maxProduct;
  }
}