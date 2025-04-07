import java.util.Scanner;
public class fibonacciseries { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum = 0;
        int a = 1;
        int b = 1;  
        for(int i=1;i<=num-2;i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println("Fibo num: " + sum);
    }
}

