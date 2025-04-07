import java.util.Scanner;
public class constructor {
    public static class agent
    {
        String name;
        int age;
        String codeman;
        boolean isUndercover;
        String assignment;
        String speciality;
        public agent(String n,int a,String c,boolean i,String as,String s)
        {
            name = n;
            age = a;
            codeman = c;
            isUndercover = i;
            assignment = as;
            speciality = s;
        }
        void introduce()
        {
            System.out.println("Hello I am agent " + codeman + ".");
            System.out.println("My real name is " + name + ".");
            System.out.println("I am " + age + " years old.");
            System.out.println("Currently i am undercove: " + isUndercover);
            System.out.println("My current assignment is: " + assignment);
            System.out.println("My speciality is: " + speciality);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the raal name of agent: ");
    }
}