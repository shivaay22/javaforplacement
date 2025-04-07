import java.util.Scanner;
public class lec1pq {
    public static void data(String name,int num,char ch,int amount,String city)
    {
        System.out.print("Name: " + name + "\n" + "Number: " + num + "\n" + "F/M: "+ ch + "\n" + "Walletamount: " + amount + "\n" + "city: " + city);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        int num = sc.nextInt();
        System.out.print("Enter F/M: " );
        char ch = sc.next().charAt(0);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        if(amount>0)
        {
            System.out.println("Sufficient balance");
        }
        else
        {
            System.out.println("NILL");
        }
        sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        data(name, num, ch, amount, city);
    }
}
