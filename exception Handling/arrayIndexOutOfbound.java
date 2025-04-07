import java.util.Scanner;

public class arrayIndexOutOfbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++)
        {
            
            arr[i] = sc.nextInt();
        }
        try
        {
            int index = sc.nextInt();
            int val = arr[index];
            System.out.println("Element: " + val);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }


    }   
}
