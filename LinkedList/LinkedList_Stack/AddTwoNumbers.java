package LinkedList.LinkedList_Stack;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }   

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arr = new ArrayList<>();    
        
        while (l1 != null) {
            arr.add(l1.val);
            l1 = l1.next;
        }

        long sum1 = 0L;
        
        for(int i = arr.size() - 1; i >= 0; i--){
            sum1 = sum1 * 10 + arr.get(i);
        }

        arr.clear();


        while (l2 != null) {
            arr.add(l2.val);
            l2 = l2.next;
        }

        
        long sum2 = 0L;


        for(int i = arr.size() - 1; i >= 0; i--){
            sum2 = sum2 * 10 + arr.get(i);
        }

        long sum = sum1 + sum2;
        
        arr.clear();

        while (sum != 0) {
            int rem = (int) sum % 10;
            arr.add(rem);
            sum /= 10;
        }

        Collections.reverse(arr);

        ListNode node = new ListNode();
        ListNode head = node;

        for(int i = 0; i < arr.size(); i++){
            node.next = new ListNode(arr.get(i));
            node = node.next;
        }

        return head.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
        }

        return head.next;
    }
}
