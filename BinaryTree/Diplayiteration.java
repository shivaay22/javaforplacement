import java.util.*;
public class Diplayiteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for the root node: ");
        int x = input.nextInt();
        TreeNode root = new TreeNode(x);
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            insert(root, size);
        }
        display(root);
    }
    public static void insert(TreeNode root, int value) {
        if (value <= root.data) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insert(root.right, value);
            }
        }
    }
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void display(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        if (root.left != null) {
            System.out.print(root.left.data + " ");
        }
        if (root.right != null) {
            System.out.print(root.right.data + " ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
}

