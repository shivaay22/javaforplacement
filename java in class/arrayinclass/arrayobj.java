import java.util.Scanner;
public class arrayobj {
     void getdetail(String name,int age)
    {
        System.out.println("Name of the person is " + name + " age of person is " + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of person");
        int n = sc.nextInt();
        arrayobj p[] = new arrayobj[n];
        for(int i=0;i<n;i++)
        {
            p[i] = new arrayobj();
            System.out.println("Enter the name of person");
            String nm = sc.nextLine();
            System.out.println("Enter the age of person");
            int a = sc.nextInt();
            sc.nextLine();
            p[i].getdetail(nm,a);
        }
        
    }
}
