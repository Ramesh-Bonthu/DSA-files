package DoubleLinkedList.BasicDLLOperations;

public class ReverseOfDLL {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        
    }

    public Node reverse(Node head) {
       Node prev = null;
       Node current = head;
       
       while(current != null){
           Node next = current.next;
           
           current.next = prev;
           current.prev = next;
           prev = current;
           current = next;
       }
       
       head = prev;
       
       return head;
    }
}
