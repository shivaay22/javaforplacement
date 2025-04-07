import java.util.*;

import javax.management.Query;

public class leveOrderTraversing {

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

        public static node insert(node root,int data)
        {
            if(root == null)
            {
                return root = new node(data);
            }
            else if(root.left == null)
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

        public static int height(node root)
        {
            if(root == null)
            {
                return 0;
            }
            // if(root.left == null && root.right == null)
            // {
            //     return 0;
            // }
            int rootValue = 1;
            int leftValue = height(root.left);
            int rightValue = height(root.right);
            int ans = rootValue + Math.max(leftValue, rightValue);
            return ans;
        }

        public static void nthLevel(node root,int n)
        {
            if(root == null)
            {
                return;
            }
            if(n == 1)
            {
                System.out.print(root.data + " ");
            }
            nthLevel(root.left,n-1);
            nthLevel(root.right, n-1);
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

        public static void bfs(node root)
        {
            Queue<node> q = new LinkedList<>();
            if(root != null)
            {
                q.add(root);
            }
            while(q.size() > 0)
            {
                node temp = q.peek();
                if(temp.left != null)
                {
                    q.add(temp.left);
                }
                if(temp.right != null)
                {
                    q.add(temp.right);
                }
                System.out.print(temp.data);
                q.remove();
            }

            /*
             Step 1:  Queue: [1]        → Print: 1     → Add 2, 3
            Step 2:  Queue: [2, 3]     → Print: 2     → Add 4, 5
            Step 3:  Queue: [3, 4, 5]  → Print: 3     → Add 6
            Step 4:  Queue: [4, 5, 6]  → Print: 4     → No new additions
            Step 5:  Queue: [5, 6]     → Print: 5     → No new additions
            Step 6:  Queue: [6]        → Print: 6     → No new additions
            Step 7:  Queue: []         → Done!

             */

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }
        // display(root);
        int level = height(root);
        // System.out.println(level);
        for(int i=2;i<=level;i++)
        {
            nthLevel(root, i);
            System.out.println();
        }
        // System.out.println(level);

        // nthLevel(root, level);
    }

}