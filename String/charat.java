import java.util.Scanner;
public class charat {
    public static void check(String name,int count)
    {
        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(name.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        check(name,0);
    }
}
