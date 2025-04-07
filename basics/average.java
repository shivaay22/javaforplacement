import java.util.Scanner;

public class average
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ave = (a + b + c) / 3;
        System.out.println(ave); 
    }
}