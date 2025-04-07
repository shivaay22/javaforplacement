import java.util.Scanner;

public class implement {
    
    public static class node
    {
        int data;
        node left;
        node right;
        // node root;

        node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
            // this.root = null;
        }
    }

    public static node insert(node root,int data)
    {
        // node temp = root;
        if(root == null)
        {
            // temp = new node(data);
            return new node(data);
        }
        if(data < root.data)
        {
            // root.left = insert(root.left, data);
            root.left = insert(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;

    }

    public static void display(node root) {
    if (root == null) {
        return;
    }

    System.out.print(root.data + " -> ");

    // Print left child
    if (root.left != null) {
        System.out.print(root.left.data + ", ");
    } else {
        System.out.print("null, ");
    }

    // Print right child
    if (root.right != null) {
        System.out.print(root.right.data);
    } else {
        System.out.print("null");
    }

    System.out.println(); // Move to next line

    // Recursively call for left and right subtrees
    display(root.left);
    display(root.right);
}

   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        node root = null;
        int x = sc.nextInt();
        for(int i=0;i<x;i++)
        {
            root = insert(root, sc.nextInt());
        }
        display(root);
    } 
    }

