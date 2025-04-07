
import java.util.Scanner;
public class ATM {
    public static class Innerbanking {
    String name;
    int accountnumber;
    int pin;
    int balance;
    void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposited succesfuuly: " + balance);
    }
    void withdrwan(int amount)
    {
        if(amount<=balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrwan successfully: " + amount);
        }
        else
        {
            System.out.println("Insufficient amount");
        }
    }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Innerbanking account = new Innerbanking();
        System.out.print("Enter name: ");
        account.name = sc.nextLine();
        System.out.print("Enter account number: ");
        account.accountnumber = sc.nextInt();
        System.out.print("ATM pin: ");
        account.pin = sc.nextInt();
        System.out.print("Enter Balance: ");
        account.balance = sc.nextInt();
        System.out.print("Deposit amount: ");
        int DA = sc.nextInt();
        account.deposit(DA);
        System.out.print("Entered pin: ");
        int code = sc.nextInt();
        if(code == account.pin)
        {
            System.out.print("Withdrwan amount: ");
            int WA = sc.nextInt();
            account.withdrwan(WA);
        }
        else
        {
            System.out.println("You entered wrong pin");
        }
        System.out.println("Account details");
        System.out.println("Account holder: " + account.name);
        System.out.println("Account number: " + account.accountnumber);
        System.out.println("Total Balance: " + account.balance);
    }
}

