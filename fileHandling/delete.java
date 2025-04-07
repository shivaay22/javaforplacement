import java.io.File;
import java.io.IOException;
import java.util.*;

public class delete
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        File f1 = new File(str1);
        if(f1.delete())
        {
            System.out.println("Delete succefully : " + f1.getName());
        }
        else
        {
            System.out.println("Kuch v");
        }
    }
}