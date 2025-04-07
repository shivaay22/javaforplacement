import java.util.*;
import java.io.*;
import java.nio.*;
public class ReadText {
        public static void main(String[] args)throws Exception {
            try
            {
                FileOutputStream fout = new FileOutputStream("testout111.txt");
                Scanner sc = new Scanner(System.in);
                String let = sc.nextLine();
                fout.write(let.getBytes());
                String l = sc.nextLine();
                fout.write(l.getBytes());
                fout.close();
                System.out.println("Success...");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}