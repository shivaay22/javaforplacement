import java.util.Scanner;
public class lec1 {
    public static void input(String name,int age,float cgpa,char ch)
    { 
        System.out.print("Name: " + name+ "\n" + "Age: " + age + "\n" + "GPA: " + cgpa + "\n" + "Char: " + ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // use this to empty the buffer whereever applicable like not given the option to enter
        System.out.print("Enter name: " );
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter cgpa: ");
        float cgpa = sc.nextFloat();
        System.out.print("Enter char: ");
        char ch = sc.next().charAt(0);
        input(name, age, cgpa,ch);
    }
}
