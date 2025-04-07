import java.util.Scanner;

public class SimpleBT {
    public static class node
    {
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
        public static node insert(node root,int data)
        {
            if(root == null)
            {
                return new node(data);
            }
            if(root.left == null)
            {
                root.left = insert(root.left,data);
            }
            else if(root.right == null)
            {
                root.right = insert(root.right, data);
            }
            else
            {
                root.left = insert(root.left, data);
            }
            return root;
        }
        public static void display(node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.print(root.data + "->");
            if(root.left!=null)
            {
                System.out.print(root.left.data + " ");
            }
            if(root.right!=null)
            {
                System.out.print(root.right.data + " ");
            }
            System.out.println();
            display(root.left);
            display(root.right);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int val = sc.nextInt();
            root = insert(root, val);
        }
    }
}
