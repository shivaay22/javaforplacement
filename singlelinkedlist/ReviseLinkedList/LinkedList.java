import java.util.Scanner;  

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
