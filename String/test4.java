import java.util.Scanner;
public class test4 {
    public static void test(String str)
    {
        boolean flag = false;
       for(int i=0;i<str.length()/2;i++)
       {
        int n = str.length();
        if(str.charAt(i) == str.charAt(n-i-1))
        {
            flag = true;
        }
       }
       if(!flag)
       {
        System.out.println("It is not pelindrome");
       }
       else
       {
        System.out.println("It is palindrome");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        test(str);
    }
}
