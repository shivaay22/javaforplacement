import java.util.Scanner;
public class iteraionnode {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for the root node: ");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        constructBinaryTree(scanner, root);

        System.out.println("Binary Tree:");
        display(root);

        scanner.close();
    }

    public static void constructBinaryTree(Scanner scanner, Node root) {
        while (true) {
            System.out.print("Enter the value of the parent node (or -1 to stop): ");
            int parentValue = scanner.nextInt();
            if (parentValue == -1) break;

            System.out.print("Enter the value of the node to insert: ");
            int nodeValue = scanner.nextInt();

            insertNode(root, parentValue, nodeValue);
        }
    }

    public static void insertNode(Node root, int parentValue, int nodeValue) {
        if (root == null) {
            return;
        }
        if (root.data == parentValue) {
            if (root.left == null) {
                root.left = new Node(nodeValue);
            } else {
                root.right = new Node(nodeValue);
            }
        } else {
            insertNode(root.left, parentValue, nodeValue);
            insertNode(root.right, parentValue, nodeValue);
        }
    }
}
