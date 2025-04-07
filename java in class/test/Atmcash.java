import java.util.*;
public class Atmcash {
    public static class Innerbanking {
    String name;
    int accountnumber;
    int pin;
    int balance;
    Innerbanking(String name,int accountnumber,int pin,int balance)
    {
        this.name = name;
        this.accountnumber = accountnumber;
        this.pin = pin;
        this.balance = balance;
    }
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
        Innerbanking i1 = new Innerbanking("Bhardwaj jee", 12200, 2022, 50000);
        System.out.print("Enter pin: ");
        int code = sc.nextInt();
        if(code == i1.pin)
        {
            System.out.print("Withdrwan amount: ");
            int WA = sc.nextInt();
            i1.withdrwan(WA);
        }
        else
        {
            System.out.println("You entered wrong pin");
        }
        System.out.println("Account details");
        System.out.println("Account holder: " + i1.name);
        System.out.println("Account number: " + i1.accountnumber);
        System.out.println("Total Balance: " + i1.balance);
    }
}

