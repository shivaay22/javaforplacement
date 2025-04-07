import java.util.Scanner;

public class oddEvenPrint {
    
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        void printOddEven() {
            Node curr = head;
            // System.out.print("Odd numbers: ");
            while (curr != null) {
                if (curr.data % 2 != 0) {
                    System.out.print(curr.data + " ");
                }
                curr = curr.next;
            }

            // System.out.println(); // New line for formatting

            curr = head; // Reset to head
            // System.out.print("Even numbers: ");
            while (curr != null) {
                if (curr.data % 2 == 0) {
                    System.out.print(curr.data + " ");
                }
                curr = curr.next;
            }
            System.out.println(); // New line for formatting
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null"); // Indicate the end of the list
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        LinkedList ll = new LinkedList();
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            ll.insertAtTail(data);
        }

        System.out.println("Original Linked List:");
        ll.print();

        System.out.println("Separated Odd and Even Numbers:");
        ll.printOddEven();
        
        sc.close();
    }
}
