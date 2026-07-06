package DoubleLinkedList.Merge_sort_reorder;

import java.util.ArrayList;

public class ConvertBinaryToDLL {

    class Node {
        int data;
        Node left, right;

        Node() {
            this.data = 0;
            this.left = this.right = null;
        }

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void main(String[] args) {
        
    }

    Node bToDLL(Node root) {
        if(root == null) return root;
        
        ArrayList<Integer> arr = new ArrayList<>();

        inOrder(root, arr);

        Node node = new Node(arr.get(0));
        Node head = node;

        for(int i = 1; i < arr.size(); i++){
            node.right = new Node(arr.get(i));
            node.right.left = node;
            node = node.right;
        }

        node.right = null;
        
        return head;
    }

    public static void inOrder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }
}
