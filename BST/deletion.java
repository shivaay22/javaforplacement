import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class deletion {

    public static Node insert(Node root,int data)
    {
        if(root == null)
        {
            return root = new Node(data);
        }
        if(root.data > data)
        {
            root.left = insert(root.left, data);
        }
        else
        {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void delNode(Node root,int target)
    {
            if(root == null)
            {
                return;
            }
            if(root.data > target)
            {
                if(root.left == null) return;
                if(root.left.data == target)
                {
                    root.left = null;
                }
                else
                {
                    delNode(root.left, target);
                }
            }
            else
            {
                if(root.right == null) return;
                if(root.right.data == target)
                {
                    root.right = null;
                }
                else
                {
                    delNode(root.right, target); 
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            root = insert(root, arr[i]);
        }
        preorder(root);
        delNode(root, 14);
        System.out.println();
        preorder(root);
    }
}

/*50 20 60 17 34 55 89 10 28 70 14 */

50 20 60 17 34 55 89 10 28 70 14 