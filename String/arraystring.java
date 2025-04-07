import java.util.Scanner;
public class arraystring {
    
    public static void str(char a[])
    {
        char b = ' ';
        for(int i=0;i<a.length;i++)
        {
            b = a[5];
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        str(arr);
    }
}
