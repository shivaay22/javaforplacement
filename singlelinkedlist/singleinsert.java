// package singlelinkedlist;
import java.util.Scanner;
public class singleinsert {
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
            }
            tail.next = newnode;
            tail = newnode;
        }
        void insertatmid(int pos,int data)
        {
            node newnode = new node(data);
            node temp = head;
            int cnt = 1;
            while(cnt<pos-1)
            {
                temp = temp.next;
                cnt++;
            }
            newnode.next = head.next;
            head.next = newnode;
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
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        linkedlist ll = new linkedlist();
        for(int i=0;i<size;i++)
        {
            int data;
            data = sc.nextInt();
            ll.insertattail(data);
        }
        ll.insertatmid(2,22);
        ll.print();
    }
}
