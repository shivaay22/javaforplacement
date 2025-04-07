import java.util.Scanner;
public class banking {
    public static class Innerbanking {
    String name;
    int accountnumber;
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
        Innerbanking cn = new Innerbanking();
        System.out.print("Enter name: ");
        cn.name = sc.nextLine();
        System.out.print("Enter account number: ");
        cn.accountnumber = sc.nextInt();
        System.out.print("Enter Balance: ");
        cn.balance = sc.nextInt();
        System.out.print("Deposit amount: ");
        int DA = sc.nextInt();
        cn.deposit(DA);
        System.out.print("Withdrwan amount: ");
        int WA = sc.nextInt();
        cn.withdrwan(WA);
        System.out.println("Account details");
        System.out.println("Account holder: " + cn.name);
        System.out.println("Account number: " + cn.accountnumber);
        System.out.println("Total Balance: " + cn.balance);
    }
}
