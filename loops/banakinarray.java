import java.util.Scanner;
public class banakinarray {
    public static class Innerbanakinarray {
    String name;
    int accountnumber;
    int balance;
    void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposite Successfully: " + balance);
    }
    void withdrwan(int amount)
    {
        if(balance>=amount)
        {
            balance -= amount;
            System.out.println("Withdrawn Successfuly: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance: " + balance);
        }
    }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Innerbanakinarray cn = new Innerbanakinarray();
        
    }
}
