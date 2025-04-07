// // package comBackBT;

// import java.util.Scanner;

// public class preOrder {
    
//     public static class node
//     {
//         int data;
//         node left;
//         node right;

//         public node(int data)
//         {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // public static node insert(node root,int data)
//     // {
//     //     if(root == null)
//     //     {
//     //         return new node(data);
//     //     }
//     //     if(root.left == null)
//     //     {
//     //         root.left = insert(root.left, data);
//     //     }
//     //     else if(root.right == null)
//     //     {
//     //         root.right = insert(root.right, data);
//     //     }
//     //     else
//     //     {
//     //         insert(root.left, data);
//     //     }
//     //     return root;
//     // }

//     public static node insert(node root, int data) {
//         if (root == null) {
//             return new node(data);
//         }
//         if (root.left == null) {
//             root.left = new node(data);  // ✅ Fixed: Directly assigning a new node
//         } else if (root.right == null) {
//             root.right = new node(data); // ✅ Fixed: Directly assigning a new node
//         } else {
//             insert(root.left, data);  // ✅ Fixed: Ensuring balanced insertion
//         }
//         return root;
//     }
//     public static void preorder(node root)
//     {
//         if(root == null)
//         {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         node root = null;
//         int x = sc.nextInt();
//         for(int i=0;i<x;i++)
//         {
//             root = insert(root, sc.nextInt());
//         }
//         preorder(root);
//     }
// }


import java.util.Scanner;

public class preOrder {

    public static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root, int data) {
        if (root == null) {
            return new node(data);
        }
        if (root.left == null) {
            root.left = new node(data);  // ✅ Fixed: Directly assigning a new node
        } else if (root.right == null) {
            root.right = new node(data); // ✅ Fixed: Directly assigning a new node
        } else {
            insert(root.left, data);  // ✅ Fixed: Ensuring balanced insertion
        }
        return root;
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // ✅ Fixed: Added space for readability
        preorder(root.left);
        preorder(root.right);
        /*
         * We are performing Preorder Traversal (Root → Left → Right), which means that whenever we visit a node, we print its value first before visiting its children.
         */
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);          // Visit left subtree
        System.out.print(root.data + " ");  // Visit root
        inorder(root.right);         // Visit right subtree
        /*
        In inorder traversal, we first visit the left subtree, then print the root node, and finally visit the right subtree.

Order of Execution for Inorder Traversal:
Go Left → Move to the leftmost node.
Print the Node → Once we reach a node with no left child, we print it.
Go Right → Move to the right subtree and repeat.

         Start with root = 1.
Call inorder(root.left) → Move to node 2.
Call inorder(root.left) → Move to node 4.
Call inorder(root.left), but node 4's left is null, so return.
Print 4.
Call inorder(root.right), but node 4's right is null, so return.
Back to node 2, print 2.
Call inorder(root.right) → Move to node 5.
Call inorder(root.left), but node 5's left is null, so return.
Print 5.
Call inorder(root.right), but node 5's right is null, so return.
Back to root (1), print 1.
Call inorder(root.right) → Move to node 3.
Call inorder(root.left), but node 3's left is null, so return.
Print 3.
Call inorder(root.right), but node 3's right is null, so return.
End of traversal.
         */
    }

    public static void postorder(node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

        /*
         * inorder(root.left);          // Visit left subtree
        System.out.print(root.data + " ");  // Visit root
        inorder(root.right);         // Visit right subtree
        /*
        1️⃣ Start at root = 1
Call postorder(root.left), move to node 2
2️⃣ At node 2
Call postorder(root.left), move to node 4
3️⃣ At node 4
Call postorder(root.left), but node 4's left is null, so return
Call postorder(root.right), but node 4's right is null, so return
Print 4
Return to node 2
4️⃣ Back at node 2
Call postorder(root.right), move to node 5
5️⃣ At node 5
Call postorder(root.left), but node 5's left is null, so return
Call postorder(root.right), but node 5's right is null, so return
Print 5
Return to node 2
6️⃣ Back at node 2
Print 2
Return to root (1)
7️⃣ Back at root = 1
Call postorder(root.right), move to node 3
8️⃣ At node 3
Call postorder(root.left), but node 3's left is null, so return
Call postorder(root.right), but node 3's right is null, so return
Print 3
Return to root (1)
9️⃣ Back at root = 1
Print 1
         */

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            root = insert(root, sc.nextInt());
        }
        sc.close(); // ✅ Fixed: Closed scanner to prevent memory leaks
        // preorder(root);
        inorder(root);
    }
}



/*
 * 
Traversal Type	Order
Preorder (Root → Left → Right)	1 2 4 5 3
Inorder (Left → Root → Right)	4 2 5 1 3
Postorder (Left → Right → Root)	4 5 2 3 1
In preorder, we print a node first before visiting its children.
In inorder, we visit the left subtree first, then print the node, then visit the right.
In postorder, we only print the node after visiting both left and right subtrees.
Postorder is useful for tasks like deleting a tree (since children are processed before the parent). 🚀








 */


 /*
  * Start at 1 (Root)

Traverse left subtree (2)

At 2

Traverse left subtree (4)

At 4

Traverse left subtree (6)

At 6

Left is null, Right is null, Print 6

Return to 4

At 4

Traverse right subtree (7)

At 7

Left is null, Right is null, Print 7

Return to 4

At 4

Left subtree is done (6)

Right subtree is done (7)

Print 4

Return to 2

At 2

Traverse right subtree (5)

At 5

Left is null, Right is null, Print 5

Return to 2

At 2

Left subtree is done (4 6 7)

Right subtree is done (5)

Print 2

Return to 1

At 1

Traverse right subtree (3)

At 3

Left is null, Right is null, Print 3

Return to 1

At 1

Left subtree is done (2 4 6 7 5)

Right subtree is done (3)

Print 1

Final Output (Postorder Traversal)
Copy
Edit
6 7 4 5 2 3 1

Preorder Traversal Steps (Root → Left → Right)
Start at 1 (Root)

Print 1

Traverse left subtree (2)

At 2

Print 2

Traverse left subtree (4)

At 4

Print 4

Traverse left subtree (6)

At 6

Print 6

Left is null, Right is null, return to 4

At 4

Traverse right subtree (7)

At 7

Print 7

Left is null, Right is null, return to 4, then 2

At 2

Traverse right subtree (5)

At 5

Print 5

Left is null, Right is null, return to 2, then 1

At 1

Traverse right subtree (3)

At 3

Print 3

Left is null, Right is null, return to 1

Final Output (Preorder Traversal)
Copy
Edit
1 2 4 6 7 5 3


Inorder Traversal Steps (Left → Root → Right)
Start at 1 (Root)

Traverse left subtree (2)

At 2

Traverse left subtree (4)

At 4

Traverse left subtree (6)

At 6

Left is null, Print 6, Right is null

Return to 4

At 4

Print 4

Traverse right subtree (7)

At 7

Left is null, Print 7, Right is null

Return to 4, then 2

At 2

Print 2

Traverse right subtree (5)

At 5

Left is null, Print 5, Right is null

Return to 2, then 1

At 1

Print 1

Traverse right subtree (3)

At 3

Left is null, Print 3, Right is null

Return to 1

Final Output (Inorder Traversal)
Copy
Edit
6 4 7 2 5 1 3

  */