package BinarySearchTrees.LCAandRangeQueries;

public class ClosestBST {

    public class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        ClosestBST obj = new ClosestBST();

        Node root = obj.new Node(10);

        root.left = obj.new Node(2);
        root.right = obj.new Node(11);
        root.left.left = obj.new Node(1);
        root.left.right = obj.new Node(5);
        root.left.right.left = obj.new Node(3);

        System.out.println(minDiff(root, 13));
    }

    public static int minDiff(Node root, int K) {
        
        return Diff(root, K, Integer.MAX_VALUE);
        
    }

    public static int Diff(Node root, int K, int val){

        if (root == null) {
            return val;
        }

        val = Math.min(val, Math.abs(root.data - K));

        if (K < root.data) {
            return Diff(root.left, K, val);
        }else{
            return Diff(root.right, K, val);
        }

    }
}
