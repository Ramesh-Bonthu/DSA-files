package DoubleLinkedList.BasicDLLOperations;

public class InsertionOfDLL {
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    public static void main(String[] args) {
        
    }

    Node insertAtPos(Node head, int p, int x) {
        Node node = head;

        int count = 0;

        while (count != p) {
            node = node.next;
            count++;
        }

        Node newNode = new Node(x);

        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        if(newNode.next != null) newNode.next.prev = newNode;
        
        return head;
    }
}
