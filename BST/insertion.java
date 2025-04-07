import java.util.*;
public class insertion {

    public static class node{
        
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static node insert(node root , int val)
        {
            if(root == null)
            {
                return root =  new node(val);
            }
            if( root.data > val)
            {
                root.left = insert(root.left, val);
                // root.left = new node(val);
            }
            else if(root.data < val)
            {
                root.right = insert(root.right, val);
                // root.right = new node(val);
            }
            return root;
        }


        public static node insert2(node root , int val)
        {
            if(root == null)
            {
                return root =  new node(val);
            }
            if( root.left == null || root.data > val)
            {
                root.left = insert(root.left, val);
                // root.left = new node(val);
            }
            else if(root.right == null || root.data < val)
            {
                root.right = insert(root.right, val);
                // root.right = new node(val);
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
                System.out.print("null,");
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

        public static node insertOneNode(node root,int data)
        {
            if(root == null)
            {
                return new node(data);
            }
            if(root.data > data)
            {
                if(root.left == null)
                {
                    root.left = new node(data);
                }
                else
                {
                    insert(root.left, data);
                }
            }
            else
            {
                if(root.right == null)
                {
                    root.right = new node(data);
                }
                else
                {
                    insert(root.right, data);
                }
            }
            return root;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        node root = null;
        for(int i=0;i<size;i++)
        {
            root = insert(root, sc.nextInt());
        }
        display(root);
        insert(root, 15);
        System.out.println();
        display(root);
    }
}
