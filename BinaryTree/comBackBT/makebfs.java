import java.util.LinkedList;
import java.util.Queue;


class node
{
    int data;
    node left;
    node right;

    node(int data)
    {
        this.data = data;
    }
}
public class makebfs {

    public static node constructbfs(String[] arr)
    {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        node root = new node(x);
        Queue<node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i<n-1)
        {
            node temp = q.remove();
            node left = new node(10);
            node right = new node(100);
            if(arr[i].equals(""))
            {
                left = null;
            }
            else
            {
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }

            if(arr[i+1].equals(""))
            {
                right = null;
            }
            else
            {
                int r = Integer.parseInt(arr[i+1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i = i + 2;
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
        String[] arr = {"1","2","3","4","","","6"};
        node root = constructbfs(arr);
        display(root);
    }
}
