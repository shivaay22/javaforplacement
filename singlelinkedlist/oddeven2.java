import java.util.Scanner;
public class oddeven2 {
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
        int size = 0;
        void inserattail(int val)
        {
            node newnode = new node(val);
           if(this.head == null)
           {
            head = tail = newnode;
           }
           tail.next = newnode;
           tail = newnode;
           size++;
        }
        void len()
        {
            System.out.println("Size: " + size);
        }
        void print()
        {
            node temp = head;
            int cnt = 0;
            while(temp!=null)
            {
                if(cnt<size-1)
                {
                    System.out.print(temp.data + " ");
                }
                temp = temp.next;
                cnt++;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        System.out.println();
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int data = sc.nextInt();
            ll.inserattail(data);
        }
        ll.len();
        ll.print();
    }
}