/*
Create a class ATM Machine
and declare a variable atmcash
intialize the data member through the static block
create a subclass of AtmMachine as customer
having the fields acc_num,name,cur_bal and w_amt
intialize all the data member through the constructor of class
create a method transaction() by which cutomer wil withdraw some amount from the ATM
Show the detail of the Customer like n
once the transaction is done
create atleast 2 Customer and show the final balance amount in the ATM
Take the inputs from the user usin Scanner class
*/
import java.util.Scanner;

class classATM {
    static double atmcash;

    static {
        atmcash = 100000;
        System.out.println("Total amount before transactions are " + atmcash);
    }
}
class Customer extends classATM {
    String name;
    double acc_num, cur_bal, w_amt;
    Customer(String name, double acc_num, double cur_bal, double w_amt) {
        this.name = name;
        this.acc_num = acc_num;
        this.cur_bal = cur_bal;
        this.w_amt = w_amt;
    }
    void transaction() {
        if (w_amt > cur_bal) {
            System.out.println("Insufficient balance");
        } else {
            cur_bal -= w_amt;
            atmcash -= w_amt;
            System.out.println("Name: " + name + ", Account Number: " + acc_num + ", Current Balance: " + cur_bal);
        }
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double acc_num, cur_bal, w_amt;
        System.out.println("Enter the name: ");
        name = scanner.next();
        System.out.println("Enter the account number: ");
        acc_num = scanner.nextDouble();
        System.out.println("Enter the current balance: ");
        cur_bal = scanner.nextDouble();
        System.out.println("Enter the withdrawal amount: ");
        w_amt = scanner.nextDouble();
        Customer c1 = new Customer(name, acc_num, cur_bal, w_amt);
        c1.transaction();
        System.out.println("Enter the name: ");
        name = scanner.next();
        System.out.println("Enter the account number: ");
        acc_num = scanner.nextDouble();
        System.out.println("Enter the current balance: ");
        cur_bal = scanner.nextDouble();
        System.out.println("Enter the withdrawal amount: ");
        w_amt = scanner.nextDouble();
        Customer c2 = new Customer(name, acc_num, cur_bal, w_amt);
        c2.transaction();
        System.out.println("Total amount after transactions are " + classATM.atmcash);
    }

