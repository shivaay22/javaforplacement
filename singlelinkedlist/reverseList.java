import java.util.Scanner;

public class reverseList {
    
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

    void reverse()
    {
        node prev = null;
        node curr = head;
        node after = null;

        while(curr != null)
        {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        head = prev;
    }

    void display()
    {
        node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        for(int i=0;i<5;i++)
        {
            ll.insertattail(sc.nextInt());
        }
        ll.reverse();
        ll.display();
    }
}
