import java.util.Scanner;

// import insertSect.linkedList;

public class deleteDup {

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

        void deleteduplicates()
        {
            node curr = head;
            while(curr != null)
            {
                node currNext = curr;
                while(currNext.next != null)
                {
                    if(currNext.data == curr.data)
                    {
                        currNext.next = currNext.next.next;
                    }
                    currNext= currNext.next;
                }
                curr = curr.next;
            }
        }

        void print()
        {
            node temp = head;
            while(temp != null)
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
            ll.insertattail(sc.nextInt());
        }
        ll.deleteduplicates();
        ll.print();
    
    }
}
