import java.util.Scanner;

public class inputsumBT {
    public static class node {
        int data;
        node left;
        node right;
        
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Function to insert a new node in the binary tree
    public static void insertNode(node root, int data) {
        if (root == null)
            return;
        
        // Insert in the left subtree if data is less than current node's data
        if (data < root.data) {
            if (root.left == null) {
                root.left = new node(data);
            } else {
                insertNode(root.left, data);
            }
        }
        // Insert in the right subtree if data is greater than current node's data
        else {
            if (root.right == null) {
                root.right = new node(data);
            } else {
                insertNode(root.right, data);
            }
        }
    }
    
    // Function to calculate the sum of all nodes in the binary tree
    public static int sum(node root) {
        if (root == null) {
            return 0;
        }
        int rootnode = root.data;
        int leftnode = sum(root.left);
        int rightnode = sum(root.right);
        int sumofnodes = rootnode + leftnode + rightnode;
        return sumofnodes;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the root node
        System.out.print("Enter the data for the root node: ");
        int rootData = scanner.nextInt();
        node root = new node(rootData);
        
        // Taking input for other nodes using while loop
        int data = 0;
        while (data != -1) {
            System.out.print("Enter data to insert (or enter -1 to stop): ");
            data = scanner.nextInt();
            if (data != -1) {
                insertNode(root, data);
            }
        }
        
        // Print the sum of the binary tree
        System.out.println("Sum of the binary tree: " + sum(root));
        
        scanner.close();
    }
}
