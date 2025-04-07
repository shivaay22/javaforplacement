import java.util.Scanner;

public class reviseBT {
    public static class node
    {
        int data;
        node right;
        node left;
        node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void insert(node root,int data)
    {
        if(root == null)
        {
            root = new node(data);
        }
        if(root.left == null)
        {
            root.left = new node(data);
        }
        if(root.right == null)
        {
            root.right = new node(data);
        }
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
            insert(root, val);
        }
        display(root);
    }
}
