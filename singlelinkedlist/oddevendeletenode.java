import java.util.Scanner;
public class oddevendeletenode {
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
        void insertattail(int data)
        {
            node newnode = new node(data);
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
        void alternate()
        {
            int count = 0;
            node curr = head;
            while(curr!=null)
            {
                if(count%2!=0)
                {
                    System.out.print(curr.data + "->");
                }
                curr = curr.next;
                count++;
            }
        }

        void oddevenprint()
        {
            node curr = head;
            while(curr!=null)
            {
                if(curr.data % 2 != 0)
                {
                    System.out.print(curr.data + "->"); 
                }
                curr = curr.next;
            }

            curr = head;
            while(curr != null)
            {
                if(curr.data % 2 == 0)
                {
                    System.out.print(curr.data + "->");
                }
                curr = curr.next;
            }
            System.out.println();
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
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.print();
        ll.oddevenprint();
    }
}
