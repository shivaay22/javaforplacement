import java.util.Scanner;
public class singlereverse {
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
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
        }

        void insertattail2(int data)
        {
            node newnode = new node(data);
            if(this.head == null)
            {
                head = newnode;
                tail = newnode;
            }
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
        }
        void reverse()
        {
            node prev = null;
            node curr = tail = head;
            node forward = null;

            while(curr!=null)
            {
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            head = prev;
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
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        linkedlist ll = new linkedlist();
        for(int i=0;i<size;i++)
        {
            int data;
            data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.print();
        ll.reverse();
        ll.print();
    }
}
