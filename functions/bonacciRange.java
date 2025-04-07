import java.util.Scanner;
public class bonacciRange {
    public static void range(int LB, int UB) {
        int a = 0;
        int b = 1;
        for (int i = 0; a <= UB; i++) {
            if (a >= LB) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int LB = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int UB = sc.nextInt();
        range(LB, UB);
        sc.close();
    }
}
