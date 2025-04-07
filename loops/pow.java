import java.util.Scanner;

public class pow {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.print("Enter pow: ");
        int pow = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=pow;i++)
        {
            ans = ans * num;
        }
        System.out.println("Num: " + ans);
    }
}
