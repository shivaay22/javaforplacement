import java.util.Scanner;
public class alternatedelet {
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
        void alternatedelete()
        {
            node curr = head;
            while(curr!=null && curr.next != null)
            {
                curr.next = curr.next.next;
                curr = curr.next;
            }
        }

        // void alternatedelete()
        // {
        //     node curr = head;
        //     node fast = head;
        //     while(fast != null && fast.next != null)
        //     {
        //         node slow = curr.next;
        //         fast.next = fast.next.next;
        //         curr = curr.next;
        //     }
        // }
        void print()
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
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
        ll.alternatedelete();
        ll.print();
    }
}

