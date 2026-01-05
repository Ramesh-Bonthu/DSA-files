package Arrays;
// Definition for a binary tree node.
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class KthSmallestInBST {
  private int count = 0;
  private int result = -1;

  public int kthSmallest(TreeNode root, int k) {
    inorder(root, k);
    return result;
  }

  private void inorder(TreeNode node, int k) {
    if (node == null)
      return;

    inorder(node.left, k);
    count++;
    if (count == k) {
      result = node.val;
      return;
    }
    inorder(node.right, k);
  }

  // Main method for testing
  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);

    KthSmallestInBST obj = new KthSmallestInBST();
    int k = 3;
    System.out.println("Kth smallest element is: " + obj.kthSmallest(root, k));
  }
}
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/