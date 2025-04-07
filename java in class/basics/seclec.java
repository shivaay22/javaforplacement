import java.util.Scanner;
public class seclec {
    public static void sum(int a,int b)
{
    int c = a + b;
    System.out.println("Sum of a + b is: " + c);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sum(a, b);
    }
}
