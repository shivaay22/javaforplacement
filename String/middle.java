import java.util.Scanner;
public class middle {
    public static void get(String str)
    {
            int mid = str.length() / 2;
            System.out.println((char) str.charAt(mid));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        get(str);
    }
}
