import java.util.Scanner;
public class pq1 {
    public static void checkresult(String name,int tgpa1,int tgpa2,int tgpa3)
    {
        float CGPA = (float)(tgpa1 + tgpa2 + tgpa3) / 3;
        System.out.println("CGPA: " + CGPA);

        if(CGPA > 7.0)
        {
            System.out.println("You are eligible");
        }
        else
        {
            System.out.println("You are not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String s1 = sc.nextLine();
        System.out.print("TGPA1: ");
        int t1 = sc.nextInt();
        System.out.print("TGPA2: ");
        int t2 = sc.nextInt();
        System.out.print("TGPA3: " );
        int t3 = sc.nextInt();
        checkresult(s1, t1, t2, t3);
    }
}
