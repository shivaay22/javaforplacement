import java.util.Scanner;
public class strarray {
    public static char[] arr(char a[])
    {
        char b[] = new char[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        char str[] = new char[5];
        for(int i=0;i<str.length;i++)
        {
            str[i] = sc.next().charAt(0);
        }
        char cp[] = arr(str);
        for(int i=0;i<str.length;i++)
        {
            System.out.print(cp[i] + " ");
        }
        System.out.println();
    }
}
