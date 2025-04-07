import java.util.Scanner;
public class charinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        // char ch = sc.next().charAt(0);
        // System.out.println("Char: " + ch);
        char arr[] = new char[size];
        sc.nextLine();
        System.out.print("Enter " + size + " characters: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
