package Arrays;
import java.util.Stack;

public class DailyTemperatures {
  public static int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>(); // stack to store indices

    for (int i = 0; i < n; i++) {
      // Check if current temp is warmer than stack's top day
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int prevDay = stack.pop();
        result[prevDay] = i - prevDay; // days waited
      }
      stack.push(i); // push current index
    }
    return result;
  }

  // Main method to test
  public static void main(String[] args) {
    int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
    int[] result = dailyTemperatures(temperatures);

    System.out.print("Temperatures: ");
    for (int temp : temperatures) {
      System.out.print(temp + " ");
    }

    System.out.print("\nResult:       ");
    for (int days : result) {
      System.out.print(days + " ");
    }
  }
}
