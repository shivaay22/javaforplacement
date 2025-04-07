import java.util.Scanner;
public class constructor {
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
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int rno = sc.nextInt();
        students s1 = new students(name, age, rno);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Rno: " + s1.rno);
    }
}
