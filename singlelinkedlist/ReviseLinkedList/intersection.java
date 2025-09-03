import java.util.*;
class Node {     
        int data;     
        Node next;      
    
        Node(int data) {         
            this.data = data;         
            this.next = null;     
        } 
    }  
    
    class LinkedList {              
            Node head = null;         
            Node tail = null;          
    
            void insertAtEnd(int data) {             
                Node newnode = new Node(data);  // Fixed the variable name             
                if (head == null) {                 
                    head = tail = newnode;             
                } else {                 
                    tail.next = newnode;                 
                    tail = newnode;             
                }         
            }
            
            Node intersection(Node head1,Node head2)
            {
                int size1 = 0;
                Node temp1 = head1;
                while(temp1 != null)
                {
                    temp1 = temp1.next;
                    size1++;
                }
                Node temp2 = head2;
                int size2 = 0;
                while(temp2 != null)
                {
                    temp1 = temp2.next;
                    size2++;
                }
                temp1 = head1;
                temp2 = head2;
                
                if(size1 > size2)
                {
                   int steps = size1 - size2;
                   for(int i=1;i<=steps;i++)
                   {
                        temp1 = temp1.next;
                   }
                }
                else
                {
                    int steps = size2 - size1;
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
        }
    
    public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         
        LinkedList ll = new LinkedList();         
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {             
            ll.insertAtEnd(sc.nextInt());         
        }         
        
        sc.close(); // Close the Scanner to avoid resource leak
        
        System.out.println("First element in the linked list: " + ll.head.data);     
    }
}
