import java.util.Scanner;

public class sizeAndsum {

    // int diameter = 0;
    public static class node
    {

        int data;
        node left;
        node right;
        int diameter = 0;

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
            return root = new node(data);
        }
        if(root.left == null)
        {
            root.left = new node(data);
        }
        else if(root.right == null)
        {
            root.right = new node(data);
        }
        else
        {
            insert(root.left, data);
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

    public static int size(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = size(root.left);
        int right = size(root.right);
        int ans = 1 + left + right;
        return ans;
    }

    public static int sum(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int ans = root.data + sum(root.left) + sum(root.right);
        return ans;
    }

    public static int height(node root)
    {
        if(root == null)
        {
            return 0;
        }
      
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
          // if(root.left == null && root.right == null)
        // {
        //     return 0;
        // }
    }

    public static int height2(node root)
    {

        if(root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currDiamter = leftHeight + rightHeight;
       
        System.out.println("curr: " + currDiamter);
        return 1 + Math.max(leftHeight,rightHeight);
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
            System.out.print(root.left.data + " ");
        }
        if(root.right != null)
        {
            System.out.print(root.right.data);
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
    
    public static int max(node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        int a = root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        node root = null;
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }
        // System.out.println("Size: " + size(root));
        // System.out.println("Sum: " + sum(root));
        display(root);
        // System.out.println(height(root));
        // System.out.println(height2(root));

    }
}
