package BinaryTrees;

import java.util.Scanner;

public class BinaryTree {

    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
        
    }

    private static Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    public void populate(Scanner sc, Node node){
        System.out.println("Do you want insert at left of : "+ node.value +" ");
        Boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("Enter the element to insert left :");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want insert at right of : "+ node.value +" ");
        Boolean right = sc.nextBoolean();
        if (right) {
             System.out.println("Enter the element to insert right :");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
       
    }

    public void display(Node node){
        display(node, "");
    }

    public void display(Node node,String ind){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        display(node.left, ind + " ");
        display(node.right, ind + " ");
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);

        tree.display(root);
    }
}