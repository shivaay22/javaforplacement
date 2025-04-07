import java.util.Scanner;
interface Payment {
    int i = 20;
    void transaction();
    default void calculate() {
        // Default implementation for calculate method
    }
    abstract class Emp implements Payment {
        // Abstract class implementing Payment interface
    }
    interface Customer {
        void get();
    }
    interface Child extends Payment {
        // Child interface extending Payment interface
    }
    class BookTickets implements Payment, Customer {
        String n;
        int p;
        int t = 200;
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter customer name: ");
            n = sc.next();
            System.out.print("Enter payment amount: ");
            p = sc.nextInt();
        }
        public void get() {
            if (p == t) {
                System.out.println("Booked for the customer " + n + " by paying the amount " + p);
            } else {
                System.out.println("Payment Failed");
            }
        }
        @Override
        public void transaction() {
            // Implementation of transaction method
        }
    }
    public static void main(String args[]) {
        BookTickets bookTickets = new BookTickets();
        bookTickets.get(); // Perform the payment and booking
    }
}
