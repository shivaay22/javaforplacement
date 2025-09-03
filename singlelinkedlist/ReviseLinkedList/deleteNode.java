public class deleteNode {

    public static class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList
    {
        node head = null;
        node tail = null;
        int size = 0;
        void insertattail(int data)
        {
            node newnode = new node(data);
            if(head == null)
            {
                head = tail = newnode;
            }
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
            size++;
        }

        void deleteNode(int pos)
        {
            if(pos == 1)
            {
                head = head.next;
                return;
            }
            else
            {
                node temp = head;
                for(int i=1;i<pos-1;i++)
                {
                    temp = temp.next;
                }
                System.out.println(temp.next.data);
                temp.next = temp.next.next;
            }
        }



        node findNode(int value) {
            node temp = head;
            while (temp != null) {
                if (temp.data == value) return temp;
                temp = temp.next;
            }
            return null;
        }

        void deleteNode2(node n)
        {
            n.data = n.next.data;
            n.next = n.next.next;
        }

        void print(int n)
        {
            int b = 10;
            n = b;
            System.out.println(n);
        }

        // Returns the nth node (0-based indexing)
    node nthNode(node head, int n) {
    node temp = head;
    int count = 1;

    while (temp != null) {
        if (count == n)
            return temp;
        count++;
        temp = temp.next;
    }

    return null; // n is out of bounds
}

node nthFromEnd(node head,int n)
{
    // int size = 0;
    // node temp = head;
    // while(temp!=null)
    // {
    //     size++;
    //     temp = temp.next;
    // }
    // int m = size - n + 1;
    // temp = head;
    // for(int i=1;i<=m-1;i++)
    // {
    //     temp = temp.next;
    // }
    // return temp;

    node slow = head;
    node fast = head;

    for(int i=1;i<=n;i++)
    {
        fast = fast.next;
    }
    while(fast != null)
    {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
        void display()
        {
            node temp = head;
            // for(int i=0;i<size;i++)
            // {
            //     System.out.print(temp.data + " ");
            //     temp = temp.next;
            // }
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertattail(10);
        ll.insertattail(20);
        ll.insertattail(30);
        ll.insertattail(40);
        ll.insertattail(50);
        // node data = ll.findNode(20);
        // ll.deleteNode2(data);
        // ll.display();
        // ll.print(5);
        // node ans = ll.nthNode(ll.head, 4);
       
        // System.out.println(ans.data);
        ll.deleteNode(2);
        ll.display();
    }
    
}
