import java.util.Scanner;
public class reverse2 {
    public static void reverse(char a[])
    {
        int start = 0;
        int end = a.length-1;
        while(start<=end)
        {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        reverse(ch);
        String sb = new String(ch);
        System.out.println(sb);
        
    }
}
