package Arrays;

import java.util.Scanner;

/*
 * Consider the leftmost and righmost appearances of some value in an array.
 *  We'll say that the "span" is the number of elements between the two inclusive. 
 * A single value has a span of 1. Returns the largest span found in the given array. 
 * (Efficiency is not a priority.)
  maxSpan([1, 2, 1, 1, 3]) → 4
  maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
  maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */

public class MaxSpan01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[10];
    System.out.print("enter the size of array :");
    int n = sc.nextInt();
    System.out.println("enter elements : ");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    MaxSpan01 obj = new MaxSpan01();
    int large = obj.maxSpan(nums, n);
    System.out.println("Max span is " + large);
    sc.close();
  }

  public int maxSpan(int[] nums, int n) {
    int[] b = new int[n];
    int max = 0, maxspan;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (nums[i] == nums[j]) {
          max = j;
        }
      }
      maxspan = max - i + 1;
      b[i] = maxspan;
    }
    int span = 0;
    for (int i = 0; i < b.length; i++) {
      if (b[i] > span) {
        span = b[i];
      }
    }
    return span;
  }
}
