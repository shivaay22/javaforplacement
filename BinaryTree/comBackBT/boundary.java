import java.util.Scanner;

class node
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

public class boundary {

    public static node insert(node root,int data)
    {
        if(root == null)
        {
            return new node(data);
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
            root.left = insert(root.left, data);
        }
        return root;
    }

    public static void leftBoundary(node root)
    {
        if(root == null) return;

        if(root.left == null && root.right == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        if(root.left != null)
        {
            leftBoundary(root.left);
        }
        else
        {
            leftBoundary(root.right);
        }

    }

    public static void bottom(node root)
    {
        if(root == null) return;
        if(root.left == null && root.right == null)
        {
            System.out.print(root.data + " ");
        }
        else
        {
            bottom(root.left);
            bottom(root.right);
        }
    }

    public static int height(node root)
    {
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void level(node root)
    {
        
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
            System.out.print(root.right.data + " ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }
        bottom(root);
        
    }
}


/*
 *

     public static node insert(node root, int data) {
        node newNode = new node(data);
        if (root == null) {
            return newNode;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                q.add(temp.right);
            }
        }

        return root;
    }
    
 */

