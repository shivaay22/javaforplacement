import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("It is " + ch + " Vowel");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("It is " + ch + " Vowel");
        }
        else
        {
            System.out.println("It is consonant: " + ch);
        }
    }
}
