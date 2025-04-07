import java.util.*;
class student
{
    String name;
    int age;
    double cgpa;

    student(String name,int age,double cgpa)
    {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    public String toString()
    {
        return "[ name = " + name + "age = " + age + "cgpa = " + cgpa + "]";
    }
}

public class nonStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        student[] s1 = new student[size];
        for(int i=0;i<size;i++)
        {
            String name = sc.nextLine();
            int age = sc.nextInt();
            double cgpa = sc.nextDouble();
            sc.nextLine();
            s1[i] = new student(name, age, cgpa); 
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(s1[i].toString());
        }
    }
}
