import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class reviseWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            String str1 = sc.nextLine();
            FileWriter f1 = new FileWriter(str1);
            String str2 = sc.nextLine();
            f1.write(str2);
            System.out.println("Written succefully");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
}
}
