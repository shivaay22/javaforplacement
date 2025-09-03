// package twopointer;
import java.util.Scanner;

// import twopointer.nthNode.node.linkeddddlissst;

public class nthNode {

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

    public static class linkeddddlissst
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
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
        }

            node getnthNode(node head,int pos)
            {
                node slow = head;
                node fast = head;

                for(int i=0;i<pos;i++)
                {
                    fast = fast.next;
                }

                while(fast!=null)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            
            node deleteNode(node head,int pos)
            {
                node slow = head;
                node fast = head;


                for(int i=0;i<pos;i++)
                {
                    fast=fast.next;
                }
                while(fast.next != null)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                node deletenode = slow.next;
                slow.next = slow.next.next;

                System.out.println("Deleted Node: " + deletenode.data);
                return head;
            }

            void display()
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
       linkeddddlissst ll = new linkeddddlissst();
       int n = 6;
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            ll.insertattail(data);
        }
        
        // node ans = ll.getnthNode(ll.head, 2);
        // System.out.println(ans.data);
        // node temp = ll.head;
        // ll.display();
        // node ans = ll.deleteNode(ll.head, 2);
            node ans = ll.getnthNode(ll.head, 2);
        // ll.display();
        System.out.println(ans.data);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        
    }
}
