import java.util.Scanner;
public class findnthnode {
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
        void size()
        {
            int size = 0;
            node temp = head;
            while(temp!=null)
            {
                size++;
                temp = temp.next;
            }
            System.out.println("Size: " + size);
        }
        node findnode(int n)
        {
            int size = 0;
            node temp = head;
            while(temp!=null)
            {
                size++;
                temp = temp.next;
            }
            temp = head;
            int m = size - n + 1;
            for(int i=0;i<m-1;i++)
            {
                temp = temp.next;
            }
            return temp;
        }
    }
    public static void main(String[] args) {
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
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        node curr = ll.findnode(n);
        ll.size();
        System.out.println("nth node: " + curr.data);
    }
}
