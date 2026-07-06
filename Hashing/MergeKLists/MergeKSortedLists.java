package Hashing.MergeKLists;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        MergeKSortedLists obj = new MergeKSortedLists();

        // Creating linked lists
        ListNode l1 = obj.new ListNode(1);
        l1.next = obj.new ListNode(4);
        l1.next.next = obj.new ListNode(5);

        ListNode l2 = obj.new ListNode(1);
        l2.next = obj.new ListNode(3);
        l2.next.next = obj.new ListNode(4);

        ListNode l3 = obj.new ListNode(2);
        l3.next = obj.new ListNode(6);

        // Array of linked lists
        ListNode[] lists = {l1, l2, l3};

        // Calling function
        ListNode result = obj.mergeKLists(lists);

        // Printing result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(ListNode list : lists){

            while (list != null) {
                pq.add(list.val);

                list = list.next;
            }
            
        }

        ListNode result = ans;

        while (!pq.isEmpty()) {
            ans.next = new ListNode(pq.poll());
            ans = ans.next;
        }

        return result.next;

    }

}
