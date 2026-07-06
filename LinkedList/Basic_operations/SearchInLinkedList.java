package LinkedList.Basic_operations;


public class SearchInLinkedList {

    class Node {
        int data;
        Node next;

        Node(int d)  { data = d;  next = null; }
    }
    public static void main(String[] args) {
        
    }
    public boolean searchKey(Node head, int key) {
        Node node = head;

        while (node != null) {
            if (node.data == key) {
                return true;
            }
            node = node.next;
        }

        return false;
    }
}
