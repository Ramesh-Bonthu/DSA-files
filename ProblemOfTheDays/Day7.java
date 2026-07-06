package ProblemOfTheDays;

public class Day7 {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Day7 day = new Day7();

        ListNode root = day.new ListNode(1);
        root.next =day.new ListNode(2); 
        root.next.next =day.new ListNode(3); 
        root.next.next.next =day.new ListNode(4); 
        root.next.next.next.next =day.new ListNode(5); 
        root.next.next.next.next.next =day.new ListNode(6); 
        root.next.next.next.next.next.next =day.new ListNode(7); 

        ListNode node = deleteMiddle(root);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode count = null;
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            count = first;
            first = first.next;
            second = second.next.next;  
        }

        count.next = first.next;

        return head;
    }
}
