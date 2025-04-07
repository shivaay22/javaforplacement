import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int fact = 1;
        while(num<=6)
        {
            fact = fact * num;
            num++;
        }
        System.out.println("Factorial: " + fact);
    }
}
