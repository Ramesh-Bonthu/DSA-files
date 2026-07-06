package LinkedList.Basic_operations;

public class RemoveNthNodeFromEnd {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode node = head;

        while (node != null) {
            size++;
            node = node.next;
        }

        if (size == 1) {
            return head = head.next;
        }

        node = head;

        for(int i = 1; i < size - n; i++){
            node = node.next;
        }

        node.next = node.next.next;

        return head;
    }
}
