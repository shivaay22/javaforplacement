// import java.util.Scanner;

public class pelindrome {


    public static void pel(int num)
    {
        int temp = num;
        
        int pelindrome = 0;
        while(num != 0)
        {
            int ld = num % 10;
            pelindrome = pelindrome * 10 + ld;
            num = num / 10;
        }

        if(temp == pelindrome)
        {
            System.out.println("This is pelindrome");
        }
        else
        {
            System.out.println("Not");
        }
    }
    
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int pelindromenum = 0;
        // while(num > 0)
        // {
        //     int ld = num % 10;
        //     pelindromenum = pelindromenum * 10 + ld;
        //     num = num / 10;
        //     // System.out.println(pelindromenum);
        // }
        // System.out.println(pelindromenum);
        pel(144);
    }
}
