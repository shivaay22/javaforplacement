import java.util.Scanner;
public class test2 {
    public static void test(String str)
    {
        String str2 = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(i%2!=0)
            {
                ch = Character.toLowerCase(ch);
            }
            str2 += ch;
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        test(str);
    }
}
