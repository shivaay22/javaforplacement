import java.util.Scanner;
public class reviseDouble {
    public static class node
    {
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static class linkedlist
    {
        node head = null;
        node tail = null;
        void insertathead(int data)
        {
           node newnode = new node(data);
           if(this.head == null)
           {
                if(this.head == null)
                {
                    head = tail = newnode;
                }
                else
                {
                    newnode.next = head;
                    head.prev = newnode;
                    head = newnode;
                }
           }
        }
        void insertattail(int data)
        {
            node newnode = new node(data);
            if(this.head == null)
            {
                head = tail = newnode;
            }
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        void insertatmid(int pos,int data)
        {
            if(pos == 1)
            {
                insertathead(data);
                return;
            }
            node curr = head;
            int cnt = 1;
            while(cnt < pos - 1)
            {
                curr = curr.next;
                cnt++;
            }
            node newnode = new node(data);
            newnode.next = curr.next;
            curr.next.prev = newnode;
            curr.next = newnode;
            newnode.prev = curr;
        }
        void deletion(int pos)
        {
            node temp = head;
            if(pos == 1)
            {
                temp.next.prev = null;
                head = head.next;
                temp.next = null;
            }
            node prev = null;
            node curr = head;
            int cnt = 1;
            while(pos<cnt)
            {
                prev = curr;
                curr = curr.next;
                cnt++;
            }
            curr.prev = null;
            prev.next = curr.next;
            curr.next = null;
        }
        void print()
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.insertatmid(2, 22);
        ll.print();
    }
}
