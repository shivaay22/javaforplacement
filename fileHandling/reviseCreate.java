import java.io.File;
import java.io.IOException;
import java.util.*;

public class reviseCreate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            String str1 = sc.nextLine();
            File f1 = new File(str1);
            f1.createNewFile();
            System.out.println("File created succefully");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
