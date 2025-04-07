import java.util.Scanner;
public class parentBT {
    public static class node
    {
        int data;
        node right;
        node left;
        node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static node insert(node root)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        root = new node(data);
        if(data==-1)
        {
            return null;
        }
        System.out.println("Enter data inserting for left: " + data);
        root.left = insert(root.left);
        System.out.println("Enter data inserting for right: " + data);
        root.right = insert(root.right);
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
        node root = null;
        root = insert(root);
        display(root);
        return;
    }
}
