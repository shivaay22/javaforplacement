// import java.util.Scanner;

public class trycatch1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try
        {
            int c = a/b;
            System.out.println("Result: " + c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to devide. reaon");
            System.out.println(e);
        }
        System.out.println("End the programme");
    }
}
