import java.util.Scanner;
public class DisplayBT2
{
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


    // public static node insert(node root, int data) {
    //     if (root == null) {
    //         return new node(data);
    //     }
    //     if (root.left == null) {
    //         root.left = new node(data);  // ✅ Fixed: Directly assigning a new node
    //     } else if (root.right == null) {
    //         root.right = new node(data); // ✅ Fixed: Directly assigning a new node
    //     } else {
    //         insert(root.left, data);  // ✅ Fixed: Ensuring balanced insertion
    //     }
    //     return root;
    // }
    
    public static void display(node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+"->");
        if(root.left!=null)
        {
            System.out.print(root.left.data + " ");
        }
        if(root.right!=null)
        {
            System.out.println(root.right.data + " ");
        }
        
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        node root = null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        display(root);
    }
}