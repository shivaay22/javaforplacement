import java.util.Scanner;
public class deletebytempnext {
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
    public static void main(String args[])
    {
        node newnode = new node(5);
        newnode.next = new node(6);
        newnode.next.next = new node(7);
        newnode.next.next.next = new node(8);
        newnode.next.next.next.next = new node(9);
        newnode.next.next.next.next.next = new node(10);
        newnode.next.next.next.next.next.next = new node(11);
        node temp = newnode;
        while(temp.next.next!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
