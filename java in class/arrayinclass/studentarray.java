import java.util.Scanner;
public class studentarray {
    public static class student
    {
        String name;
        int rollno;
        int tgpa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine();
        student[] s1 = new student[size];
        for(int i=0;i<size;i++)
        {
            student s2 = new student();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter rollno: ");
            int rollno = sc.nextInt();
            System.out.print("Enter tgpa: ");
            int tgpa = sc.nextInt();
            sc.nextLine();
            s1[i] = s2;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Name: " + s1[i].name);
            System.out.println("Rollno: " + s1[i].rollno);
            System.out.println("TGPA: " + s1[i].tgpa);
        }
    }
}
