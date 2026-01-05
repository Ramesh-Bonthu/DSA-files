package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Node {
  int val, li, ei;

  Node(int v, int l, int e) {
    val = v;
    li = l;
    ei = e;
  }
}

public class MergeKSorted {
  public static List<Integer> mergeKSorted(int[][] lists) {
    PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
    for (int i = 0; i < lists.length; i++)
      if (lists[i].length > 0)
        pq.offer(new Node(lists[i][0], i, 0));
    List<Integer> result = new ArrayList<>();
    while (!pq.isEmpty()) {
      Node n = pq.poll();
      result.add(n.val);
      if (n.ei + 1 < lists[n.li].length)
        pq.offer(new Node(lists[n.li][n.ei + 1], n.li, n.ei + 1));
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] lists = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
    System.out.println("Input lists: ");
    for (int[] l : lists)
      System.out.println(Arrays.toString(l));
    List<Integer> res = mergeKSorted(lists);
    System.out.println("Merged sorted list: " + res);
  }
}
