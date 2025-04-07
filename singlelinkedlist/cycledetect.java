import java.util.Scanner;

public class cycledetect {
    
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
    public static class linkedlist
    {
        node head = null;
        node tail = null;
        void insertattail(int data)
        {
            node newnode = new node(data);
            if(this.head == null)
            {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        boolean  checkcycle()
        {
            node slow = head;
            node fast = head;
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast)
                {
                    return true;
                }
            }
            return false;
        }
        void print()
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int data;
            data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.print();
        System.out.print(ll.checkcycle());
    }
}

