import java.util.Scanner;

public class test1 {
    public static void test(String str)
    {
        String str2 = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(i%2==0)
            {
                continue;
            }
        str2 += ch;
        }
        // StringBuilder sb = new StringBuilder(str2);
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        test(str);

    }
}
