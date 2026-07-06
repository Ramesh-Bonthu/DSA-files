package ProblemOfTheDays;

import java.util.ArrayList;

public class Day6 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }
    public int pairSum(ListNode head) {
        int sum = 0;

        ArrayList<Integer> arr =  new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            arr.add(temp.val);

            temp = temp.next;
        }

        int i = 0;
        int j = arr.size() - 1;
        
        while (i < j) {
            sum = Math.max(sum, arr.get(i) + arr.get(j));
            i++;
            j--;
        }

        return sum;
    }
}
