package LinkedList.Basic_operations;


public class OddEvenList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }

    public ListNode oddEvenList(ListNode head) {
        
        ListNode l1 = head;
        ListNode ans = l1;
        ListNode l2 = head.next;

        ListNode even = l2;

        while (l1.next != null && l2.next != null) {
            
            l1.next = l2.next;
            l1 = l1.next;

            if (l1.next != null) {
                l2.next = l1.next;
                l2 = l2.next;
            }
        }

        l1.next = even;
        l2.next = null;

        return ans;
    }
}
