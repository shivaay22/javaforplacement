import java.util.Scanner;
public class test5 {
    public static void test(char ch[])
    {
        int start = 0;
        int end = ch.length-1;
       while(start <= end)
       {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        test(ch);
        String sb = new String(ch);
        System.out.println(sb);
    }
}
