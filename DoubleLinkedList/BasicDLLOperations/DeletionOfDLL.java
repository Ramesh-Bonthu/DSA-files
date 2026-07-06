package DoubleLinkedList.BasicDLLOperations;

public class DeletionOfDLL {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    public static void main(String[] args) {
        
    }

    public Node delPos(Node head, int x) {
       if(x == 1){
            head = head.next;
            head.prev = null;
            
            return head;
        }
        
        Node node = head;
        int count = 1;

        while (count != x) {
            node = node.next;
            count++;
        }

        node.prev.next = node.next;
        if (node.next != null) {
            node.next.prev = node.prev;
        }

        return head;
    }

}
