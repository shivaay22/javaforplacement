import java.util.Scanner;
public class alternate {
    public static void change(String str)
    {
        String str2 = "";
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(i%2==0)
            {
                c = Character.toUpperCase(c);
            }
            str2 = str2 + c;
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        change(str);
    }
}
