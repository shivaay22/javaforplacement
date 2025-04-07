public class BTdisplay {
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
       node root = new node(2);
       node a = new node(4);
       node b = new node(10);
       node c = new node(6);
       node d = new node(5);
       node e = new node(11);
       root.left = a;
       root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
       display(root);
    }
}
