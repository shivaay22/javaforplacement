
import java.io.FileWriter; 
 
// Import the IOException class for handling errors
import java.io.IOException;
import java.util.Scanner; 
 
public class GFG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            String str1 = sc.nextLine();
            FileWriter f1 = new FileWriter(str1);
            String str2 = sc.nextLine();
            f1.write(str2);
            f1.close();
            System.out.println("Read succefully");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}