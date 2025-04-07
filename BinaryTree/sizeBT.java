// import java.util.Scanner;

// public class sizeBT {
//     public static class node
//     {
//         int data;
//         node left;
//         node right;
//         node(int data)
//         {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static node insert(node root,int data)
//     {
//         if(root == null)
//         {
//             return new node(data);
//         }
//         if(root.left == null)
//         {
//             root.left = insert(root.left, data);
//         }
//         else if(root.right == null)
//         {
//             root.right = insert(root.right, data);
//         }
//         else
//         {
//             insert(root.right, data);
//         }
//         return root;
//     }
//     public static int size(node root)
//     {
//         if(root == null)
//         {
//             return 0;
//         }
//         int rootnode = 1;
//         int leftnode = size(root.left);
//         int rightnode = size(root.right);
//         int treesize = rootnode + leftnode + rightnode;
//         return treesize;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     node root = null;
//     for(int i=0;i<n;i++)
//     {
//         int val = sc.nextInt();
//         root = insert(root, val);
//     }
//     // System.out.println(size(root));
//     System.out.println(root.left.right.data);
//     }
// }


import java.util.Scanner;

public class sizeBT {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (root.left == null) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }


    
    

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        System.out.println(root.data);
        System.out.println("Size of the binary tree: " + size(root));
    }
}
