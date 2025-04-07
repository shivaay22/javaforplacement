public class linkedliststack {
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
    public static class linkedstack
    {
        node head = null;
        int size = 0;
        void push(int data)
        {
            node newnnode = new node(data);
            newnnode.next = head;
            head = newnnode;
            size++;
        }
        int pop()
        {
            if(this.head == null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }
        int peek()
        {
            return head.data;
        }
        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        void displayrec(node h)
        {
            if(h==null)
            {
                return;
            }
            displayrec(h.next);
            System.out.print(h.data + " ");
        }
        void display()
        {
            displayrec(head);
            System.out.println();
        }
        // void display() {
        //     if (head == null) {
        //         System.out.println("Stack is empty");
        //         return;
        //     }
        
        //     node current = head;
        //     while (current != null) {
        //         System.out.print(current.data + " ");
        //         current = current.next;
        //     }
        //     System.out.println();
        // }
        
        void displayrev()
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
        linkedstack ll = new linkedstack();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.display(); // 10 20 30 40
        // ll.displayrec(ll.head);
        // System.out.println();
        System.out.println(ll.peek());
        ll.displayrev();
        System.out.println(ll.peek());
    }
}