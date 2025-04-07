// package PROJECTS;
import java.util.Scanner;
public class ATMarray {
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
            System.out.println("Amount withdrwan successfully: " + balance);
        }
        else
        {
            System.out.println("Insufficient amount");
        }
    }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= sc.nextInt();
        Innerbanking[] account = new Innerbanking[size];
        sc.nextLine();
        for(int i=0;i<size;i++)
        {
            Innerbanking AC1 = new Innerbanking();
            System.out.print("Enter name: ");
            AC1.name = sc.nextLine();
            System.out.print("Enter account number: ");
            AC1.accountnumber = sc.nextInt();
            System.out.print("ATM pin: ");
            AC1.pin = sc.nextInt();
            System.out.print("Enter Balance: ");
            AC1.balance = sc.nextInt();
            System.out.print("Deposit amount: ");
            int DA = sc.nextInt();
            AC1.deposit(DA);
            sc.nextLine();
            account[i] = AC1;
        }
        System.out.print("Entered pin: ");
        int code = sc.nextInt();
        boolean pinmatch = false;
        for(int i=0;i<size;i++)
        {
            if(code == account[i].pin)
            {
                pinmatch = true;
                System.out.print("Withdrwan amount");
                int wa = sc.nextInt();
                account[i].withdrwan(wa);
            }
        }
        if(!pinmatch)
        {
            System.out.println("You entered wrong pin");
        }
        System.out.println("Account details");
        for(int i=0;i<size;i++)
        {
            System.out.println("Account holder: " + account[i].name);
            System.out.println("Account number: " + account[i].accountnumber);
            System.out.println("Total Balance: " + account[i].balance);
        }
    }
}

