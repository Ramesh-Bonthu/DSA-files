package Arrays;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {
  public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int n : nums) {
      heap.offer(n);
      if (heap.size() > k)
        heap.poll();
    }
    return heap.peek();
  }

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 5, 6, 4 };
    int k = 2;
    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println(k + "th largest element: " + findKthLargest(arr, k));
  }
}
