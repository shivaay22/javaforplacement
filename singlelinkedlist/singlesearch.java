import java.util.Scanner;

public class singlesearch {
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
        void search(int key)
        {
            boolean flag = false;
            node curr = head;
            int i = 0;
            while(curr!=null)
            {
                if(curr.data == key)
                {
                    flag = true;
                    System.out.println("Key is found at: " + i);
                    break;
                }
                else
                {
                    flag = false;
                }
                curr = curr.next;
                i++;
            }
            if(!flag)
            {
                System.out.println("Not found");
            }
        }
        void print()
        {
            node temp = head;
            while(temp!= null)
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
        ll.search(10);
    }
}
