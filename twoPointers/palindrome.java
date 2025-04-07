import java.util.Scanner;

public class palindrome {
    
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

    node reverse(node head)
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
        return prev;
    }

    boolean palindrome(node head)
    {
        node slow = head;
        node fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        node temp = reverse(slow.next);
        slow.next = temp;

        node leftP = head;
        node rightP = slow.next;

        while(rightP != null)
        {
            if(leftP.data != rightP.data)
            {
                return false;
            }
            leftP = leftP.next;
            rightP = rightP.next;
        }
        return true
        ;
    }
}

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Scanner sc = new Scanner(System.in);

        int n = 5;
        for(int i=0;i<4;i++)
        {
            ll.insertAtEnd(sc.nextInt());
        }

        // node head = ll.reverse(ll.head);
        node temp = ll.head;

        for(int i=0;i<4;i++)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

        boolean ans = ll.palindrome(ll.head);
        System.out.println(ans);

    }
}

