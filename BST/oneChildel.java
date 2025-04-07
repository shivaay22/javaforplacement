import java.util.Scanner;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class oneChildel {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node deletion(Node root, int target) {
        if (root == null) {
            return null;
        }
        
        if (root.data > target) {
            root.left = deletion(root.left, target);
        } else if (root.data < target) {
            root.right = deletion(root.right, target);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            root = insert(root, arr[i]);
        }

        System.out.println("Preorder before deletion:");
        preorder(root);

        System.out.println("\nEnter the node to delete:");
        int target = sc.nextInt();
        root = deletion(root, target);

        System.out.println("Preorder after deletion:");
        preorder(root);
        sc.close();
    }
}
