import java.util.Scanner;
public class addnonstatic {
    void add(int a,int b)
    {
        int c = a + b;
        System.out.println("Sum of c: " + c);
    }
    public static int multiply(int a,int b)
    {
        int c = a * b;
        return c;
    }
    void methodshow()
    {
        System.out.println("Welcome to my calculator");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int ans = multiply(a, b);
        System.out.println("Multiply: " + ans);
        addnonstatic a1 = new addnonstatic();
        a1.add(a, b);
        a1.methodshow();
        
    } 
}
