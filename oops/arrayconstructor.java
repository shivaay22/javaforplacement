import java.util.Scanner;
public class arrayconstructor {
    public static class students
    {
        String name;
        int age;
        int rno;
        students(String name,int age,int rno)
        {
            this.name = name;
            this.age = age;
            this.rno = rno;
        }
        void print()
        {
            System.out.println("Name: " + name);
            System.out.println("Roll no: " + age);
            System.out.println("Reg no: " + rno);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine();
        students[] s1 = new students[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter reg no: ");
            int rno = sc.nextInt();
            sc.nextLine();
            s1[i] = new students(name, age, rno);
        }
        for(int i=0;i<size;i++)
        {
            s1[i].print();
        }
    }
}
