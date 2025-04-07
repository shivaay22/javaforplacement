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
        node findmid()
        {
            node slow = head;
            node fast = head;
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        boolean checkpalindrome()
    {
        if(head == null && head.next == null)
        {
            return true;
        }
        // Step 1
        node midnode = findmid();
        // step 2
        node prev = null;
        node forward = null;
        node curr = midnode;
        while(curr!=null)
        {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        node rightlinkedlisthead = prev;
        node leftlinkeldisthead = head;
        while(rightlinkedlisthead != null)
        {
            if(leftlinkeldisthead.data != rightlinkedlisthead.data)
            {
                return false;
            }
            leftlinkeldisthead = leftlinkeldisthead.next;
            rightlinkedlisthead = rightlinkedlisthead.next;
        }
        return true;
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
    public static void main(String args[])
    {
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
        ll.print();
        System.out.println(ll.checkpalindrome());
        node midnode = ll.findmid();
        // System.out.println("Mid node: " + midnode.data);
        if(size%2 == 0)
        {
            System.out.println("Mid node: " + midnode.data);
        }
        else
        {
            System.out.println("Mid node: " + midnode.next.data);
        }
    }
}

