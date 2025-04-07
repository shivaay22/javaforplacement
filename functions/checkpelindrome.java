import java.util.Scanner;

public class checkpelindrome {
    public static boolean checkpel(int num)
    {
        int pelindrome = num;
        int reverse = 0;
        while(pelindrome != 0)
        {
            int ld = pelindrome % 10;
            reverse = reverse * 10 + ld;
            pelindrome = pelindrome / 10;
        }
        if(num == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(checkpel(num))
    {
        System.out.println("Palindrome " + num);
    }
    else
    {
        System.out.println("Not pelindrome " + num);
    }
}
}
