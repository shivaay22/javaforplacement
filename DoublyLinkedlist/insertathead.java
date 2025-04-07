import java.util.Scanner;
public class insertathead {
    public static class node
    {
        node prev;
        int data;
        node next;
        node(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
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
                head = tail = newnode;
            }
            else
            {
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
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
            node temp = head;
            int cnt = 1;
            while(cnt < pos - 1)
            {
                temp = temp.next;
                cnt++;
            }
            node newnode = new node(data);
            newnode.next = temp.next;
            temp.next.prev = newnode;
            temp.next = newnode;
            newnode.prev = temp;
        }
        void delete(int pos)
        {
            node temp = head;
            if(pos==1)
            {
                temp.next.prev = null;
                head = head.next;
                temp.next = null;
                return;
            }
            else
            {
                node prev = null;
                node curr = head;
                int cnt = 1;
                while(cnt < pos)
                {
                    prev = curr;
                    curr = curr.next;
                    cnt++;
                }
                curr.prev = null;
                prev.next = curr.next;
                curr.next = null;
            }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int val = sc.nextInt();
          ll.insertatmid(2, 22);
        }
        // ll.delete(3);
        ll.print();

    }
}
