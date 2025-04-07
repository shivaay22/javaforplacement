public class heightBT {
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
    public static  int height(node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return 0;
        }
        int rootnode = root.data;
        int leftnode = height(root.left);
        int rightnode = height(root.right);
        int height = 1 + Math.max(leftnode, rightnode);
        return height;
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
       System.out.println(height(root));
    }
}
