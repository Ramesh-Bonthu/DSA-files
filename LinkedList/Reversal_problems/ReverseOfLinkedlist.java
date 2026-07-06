package LinkedList.Reversal_problems;

public class ReverseOfLinkedlist {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }

    public ListNode reverseList(ListNode head) {
        
        if (head == null) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current.next != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next.next != null) {
                next = next.next;
            }
        }
        current.next = prev;
        head = current;


        return head;
    }
}
