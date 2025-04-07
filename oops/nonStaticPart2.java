import java.util.Scanner;
class student
{
    String name;
    int age;
    double cgpa;
    public String toString()
    {
        return "[ name = " + name + "age = " + age + "cgpa = " + cgpa + "]";
    }

}
public class nonStaticPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        student[] s1 = new student[2];
        for(int i=0;i<size;i++)
        {
            s1[i] = new student();
            s1[i].name = sc.nextLine();
            s1[i].age = sc.nextInt();
            s1[i].cgpa = sc.nextDouble();
            sc.nextLine();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(s1[i].toString());
        }
    }
}
