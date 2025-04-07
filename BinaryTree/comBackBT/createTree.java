// package createBT;

import java.util.Scanner;

public class createTree {
    
    public static class node
    {
        node left;
        node right;
        int data;

        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root,int data)
    {
        if(root == null)
        {
            return new node(data);
        }
        if(root.left == null)
        {
            root.left = insert(root.left, data);
        }
        else if(root.right == null)
        {
            root.right = insert(root.right, data);
        }
        else
        {
            insert(root.left,data);
        }
        return root;
    }

   public static void display(node root)
   {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " -> ");
        if(root.left != null)
        {
            System.out.print(root.left.data + " ,");
        }
        if(root.right != null)
        {
            System.out.print(root.right.data + " ");
        }
        else if(root.left == null && root.right == null)
        {
            System.out.print("null");
        }
        System.out.println();
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


/*
 * Step 1: Insert 1
root == null, so return new node(1).

Tree:

Copy
Edit
  1
Step 2: Insert 2
root.left == null, so root.left = insert(null, 2).

Creates node 2.

Tree:

Copy
Edit
  1
 /
2
Step 3: Insert 3
root.left != null, but root.right == null, so root.right = insert(null, 3).

Creates node 3.

Tree:

Copy
Edit
  1
 / \
2   3
Step 4: Insert 4
root.left != null and root.right != null, so insert(root.left, 4).

Moves to node 2.

root.left == null, so root.left = insert(null, 4).

Creates node 4.

Tree:

markdown
Copy
Edit
    1
   / \
  2   3
 /
4
Step 5: Insert 5
root.left != null and root.right != null, so insert(root.left, 5).

Moves to node 2.

root.left != null, but root.right == null, so root.right = insert(null, 5).

Creates node 5.

Tree:

markdown
Copy
Edit
    1
   / \
  2   3
 / \
4   5
Step 6: Insert 6
root.left != null and root.right != null, so insert(root.left, 6).

Moves to node 2.

root.left != null and root.right != null, so insert(root.left, 6).

Moves to node 4.

root.left == null, so root.left = insert(null, 6).

Creates node 6.

Tree:

markdown
Copy
Edit
      1
     / \
    2   3
   / \
  4   5
 /
6
Step 7: Insert 7
root.left != null and root.right != null, so insert(root.left, 7).

Moves to node 2.

root.left != null and root.right != null, so insert(root.left, 7).

Moves to node 4.

root.left != null, but root.right == null, so root.right = insert(null, 7).

Creates node 7.

Final Tree:

markdown
Copy
Edit
      1
     / \
    2   3
   / \
  4   5
 / \
6   7

 */