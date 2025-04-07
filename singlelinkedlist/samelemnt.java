import java.util.Scanner;
public class samelemnt{
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
        void delete()
        {
            int size = 0;
            node curr = head;
            node prev = null;
            while(curr!=null)
            {
                // curr = curr.next;
                size++;
                if(size%2==0)
                {
                   prev.next = curr.next;
                   curr = null;
                }
                else
                {
                prev = curr;
                }
                if(curr!=null)
                {
                    curr = curr.next;
                }
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
        System.out.print("enter size: ");
        int size = sc.nextInt();
        linkedlist ll = new linkedlist();
        for(int i=0;i<size;i++)
        {
            int data;
            data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.delete();
        ll.print();
    }
}

