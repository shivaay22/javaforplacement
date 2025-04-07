public class sumBT {
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
    public static int sum(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int rootnode = root.data;
        int leftnode = sum(root.left);
        int rightnode = sum(root.right);
        int sumofnodes = rootnode + leftnode + rightnode;
        return sumofnodes;
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
       System.out.println(sum(root));
    }
}
