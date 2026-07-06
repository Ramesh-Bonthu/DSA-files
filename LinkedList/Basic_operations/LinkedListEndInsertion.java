package LinkedList.Basic_operations;

public class LinkedListEndInsertion {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        
    }

    public Node insertAtEnd(Node head, int x) {

        if (head == null) {
            return new Node(x);
        }
        
        Node node = head;

        while (node.next != null) {
            node = node.next;
        }

        node.next = new Node(x);

        return head;
    }
}
