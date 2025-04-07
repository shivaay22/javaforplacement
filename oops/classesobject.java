import java.util.Scanner;
public class classesobject {
    public static class students
    {
        String name;
        int height;
        int rno;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine();
        students[] studarray =  new students[size];
        for(int i=0;i<size;i++)
        {
            students s1 = new students();
            System.out.print("Enter name: ");
            s1.name = sc.nextLine();
            System.out.print("Enter height: ");
            s1.height = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter rno: ");
            s1.rno = sc.nextInt();
            sc.nextLine();
            studarray[i] = s1;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Name: " + studarray[i].name);
            System.out.println("Height: " + studarray[i].height);
            System.out.println("Roll number: " + studarray[i].rno);
        }
    }
}
