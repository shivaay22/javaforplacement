import java.util.Scanner;
public class switc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter num: ");
        num = sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Samosha");
                break;
            case 2:
                System.out.println("Rasgulla");
                break;
            case 3:
                System.out.println("mithai");
                break;
            default:
                System.out.println("Kuch v nahi");
        }
        
    }
}