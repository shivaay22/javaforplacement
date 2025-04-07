import java.util.Scanner;

public class singledelete {
    
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
        void deletion(int pos)
        {
            if(this.head == null)
            {
                System.out.print("List is empty");
                return;
            }
            if(pos == 1)
            {
                head = head.next;
                return;
            }
            node curr = head;
            int cnt = 1;
            node prev = null;
            while(cnt<pos && curr!=null)
            {
                prev = curr;
                curr = curr.next;
                cnt++;
            }
            if(curr == null)
            {
                System.out.println("position " + pos + "IS not found");
                return;
            }
            prev.next = curr.next;
            curr.next = null;
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
        ll.deletion(2);
        ll.print();
    }
}
