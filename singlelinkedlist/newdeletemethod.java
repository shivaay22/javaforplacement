import java.util.Scanner;
public class newdeletemethod {
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

        void delete(int pos)
        {
            int size = 0;
            node temp = head;
            while(temp!=null)
            {
                temp = temp.next;
                size++;
            }
            if(pos == size)
            {
                head = head.next;
                return;
            }
            int cnt = 1;
            int itofind = size - pos;
            node prev = head;
            while(cnt < itofind)
            {
                prev = prev.next;
                cnt++;
            }
            prev.next = prev.next.next;
            return;
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
        ll.delete(5);
        ll.print();
    }
}
