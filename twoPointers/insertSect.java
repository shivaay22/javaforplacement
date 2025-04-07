import java.util.Scanner;

public class insertSect {
    public static class node{
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
        void issertAtEnd(int data)
        {
            node newNode = new node(data);
            if(head == null)
            {
                head = tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
        }

        node insertSectAtSameData(node headA,node headB)
        {
            node temp1 = headA;
            node temp2 = headB;

            int lenA = 0;
            int lenB = 0;
            while(temp1 != null)
            {
                lenA++;
                temp1 = temp1.next;
            }
            while(temp2 != null)
            {
                lenB++;
                temp2 = temp2.next;
            }

            temp1 = headA;
            temp2 = headB;

            if(lenA > lenB)
            {
                int steps = lenA - lenB;
                for(int i=1;i<=steps;i++)
                {
                    temp1 = temp1.next;
                }
            }
            else
            {
                int steps = lenB - lenA;
                for(int i=1;i<=steps;i++)
                {
                    temp2 = temp2.next;
                }
            }
            
            while(temp1 != temp2)
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return temp1;
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
        Scanner sc  = new Scanner(System.in);
        linkedList ll1 = new linkedList();
        int n = 7;
        for(int i=0;i<n;i++)
        {
            ll1.issertAtEnd(sc.nextInt());
        }
        int n2 = 5;
        linkedList ll2 = new linkedList();
        for(int i=0;i<n2;i++)
        {
            ll2.issertAtEnd(sc.nextInt());
        }
        node ans = ll1.insertSectAtSameData(ll1.head,ll2.head);
        System.out.println(ans.data);
    }
}
