import java.util.*;
public class checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch[] = new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i] = sc.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u')
            {
                System.out.print(ch[i] + " ");
            }
        }
        System.out.println();
    }
}
