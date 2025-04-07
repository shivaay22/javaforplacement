import java.util.Scanner;

public class insertAtEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void insertAtstart(int data)
        {
            Node newnNode = new Node(data);
            if(head == null)
            {
                head = tail = newnNode;
            }
            else 
            {
                newnNode.next = head;
                head = newnNode;
            }
        }

        void insertAtMId(int pos,int val)
        {
            Node newNode = new Node(val);
            Node temp = head;
            if(pos == 0)
            {
                insertAtstart(val);
                return;
            }
            for(int i=1;i<=pos-1;i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        void size()
        {
            Node temp = head;
            int count = 0;
            while(temp != null)
            {
                count++;
                temp = temp.next;
            }
            System.out.println("size: " + count);
        }

        int getData(int pos)
        {
            Node temp = head;
            int cnt = 1;
            while(cnt <= pos-1)
            {
                // temp = temp.next;
                cnt++;
                temp = temp.next;
            }
            return temp.data;
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int data = sc.nextInt();
            ll.insertAtEnd(data);
        }
        // sc.close(); // Closing scanner to prevent resource leaks

        // System.out.println("Linked List:");
        // ll.display();
        // System.out.println(ll.getData(2));
        System.out.println(ll.head.data);        
    }
}
