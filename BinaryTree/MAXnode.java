public class MAXnode {
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
    public static int MAX(node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        int rootnode = root.data;
        int leftnode = MAX(root.left);
        int rightnode = MAX(root.right);
        int maxnode = Math.max(rootnode,Math.max(leftnode, rightnode));
        return maxnode;
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
       System.out.println(MAX(root));
    }
}
