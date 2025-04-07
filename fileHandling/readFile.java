import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        try
        {
            File f1 = new File(str1);
            Scanner fileReader = new Scanner(f1);
            while(fileReader.hasNextLine())
            {
                String file = fileReader.nextLine();
                System.out.println(file);
            }
            fileReader.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            sc.close();
        }
    }
}
