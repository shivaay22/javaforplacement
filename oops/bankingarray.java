import java.util.Scanner;
public class bankingarray {
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
            
            int size = sc.nextInt();
            sc.nextLine();
            Innerbanking[] cn = new Innerbanking[size];
            for(int i=0;i<size;i++)
            {
                Innerbanking c1 = new Innerbanking();
                System.out.print("Enter name: ");
                c1.name = sc.nextLine();
                System.out.print("Enter account number: ");
                c1.accountnumber = sc.nextInt();
                System.out.print("Enter balance: ");
                c1.balance = sc.nextInt();
                System.out.print("Deposit amount: ");
                int DA = sc.nextInt();
                c1.deposit(DA);
                System.out.print("Withdrwan amount: ");
                int WA = sc.nextInt();
                c1.withdrwan(WA);
                sc.nextLine();
                cn[i] = c1;
            }
            for(int i=0;i<size;i++)
            {
                System.out.println("Account holder: " +cn[i].name);
                System.out.println("Account number: " +cn[i].accountnumber);
                System.out.println("Total balance: " + cn[i].balance);
            }
        }
}
