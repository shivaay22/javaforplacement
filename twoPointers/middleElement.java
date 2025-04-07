import java.util.*;
public class middleElement {
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

    public static class linkedList
    {
        node head = null;
        node tail = null;

        void insertAtEnd(int data)
        {
            node newnode = new node(data);
            if(head == null)
            {
                head = tail = newnode;
            }
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
        }

        void findMiddleinodd()
        {
            node slow = head;
            node fast = head;

            while(fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
        }

        void findMiddleineven()
        {
            node slow = head;
            node fast = head;

            while(fast!=null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        linkedList ll = new linkedList();
        for(int i=0;i<n;i++)
        {
            ll.insertAtEnd(sc.nextInt());
        }
        ll.findMiddleinodd();
        // ll.findMiddleineven();
    }
}
