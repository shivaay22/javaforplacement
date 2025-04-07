import java.io.File;
import java.io.IOException;
import java.util.*;
public class fileCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            String str1 = sc.nextLine();
            File file1 = new File(str1);
            file1.createNewFile();
            System.out.println("File created succefully: " + file1.getName());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
