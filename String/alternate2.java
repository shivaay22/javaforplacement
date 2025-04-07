import java.util.Scanner;
public class alternate2 {
    public static void change(String str)
    {
        String res = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(i%2!=0)
            {
                ch = Character.toUpperCase(ch);
            }
            res = res + ch;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        change(str);
    }
}
