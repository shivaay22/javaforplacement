public class deleteNode {

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

    public static class LinkedList
    {
        node head = null;
        node tail = null;
        int size = 0;
        void insertattail(int data)
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
            size++;
        }

        void deleteNode(int pos)
        {
            if(pos == 1)
            {
                head = head.next;
                size--;
                return;
            }
            else
            {
                node temp = head;
                for(int i=1;i<=pos-1;i++)
                {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
                size--;
            }
        }

        void display()
        {
            node temp = head;
            for(int i=0;i<size;i++)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertattail(10);
        ll.insertattail(20);
        ll.insertattail(30);
        ll.deleteNode(2);
        ll.display();
    }
    
}
