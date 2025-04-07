import java.util.Scanner;

public class Displatbyinput {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void display(Node root) {
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

    public static Node findParentNode(Node root, int parentData) {
        // Recursive function to find the parent node with given data
        if (root == null) {
            return null;
        }
        if (root.data == parentData) {
            return root;
        }
        Node left = findParentNode(root.left, parentData);
        if (left != null) {
            return left;
        }
        return findParentNode(root.right, parentData);
    }

    public static void insert(Node root, int parentData, int data) {
        // Find the parent node to attach the new node
        Node parentNode = findParentNode(root, parentData);
        if (parentNode == null) {
            System.out.println("Parent node not found.");
            return;
        }
        // Insert the new node as left child if the parent's left is null, otherwise as right child
        if (parentNode.left == null) {
            parentNode.left = new Node(data);
        } else {
            parentNode.right = new Node(data);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for the root node: ");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        boolean continueInsertion = true;
        while (continueInsertion) {
            System.out.print("Enter the value of the parent node: ");
            int parentData = scanner.nextInt();
            System.out.print("Enter the value of the node to insert (or enter -1 to stop): ");
            int value = scanner.nextInt();
            if (value == -1) {
                continueInsertion = false;
            } else {
                insert(root, parentData, value);
            }
        }

        System.out.println("Binary Tree:");
        display(root);

        scanner.close();
    }
}
