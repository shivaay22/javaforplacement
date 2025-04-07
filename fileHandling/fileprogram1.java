/*
 * wap to ask the user for the file name in which he/she want to save the data 
 * now take the input from the user his/her name,contact number,age etc and save it in the file
 * 
 */
import java.io.*;
import java.util.*;
public class fileprogram1 {
    public static void main(String[] args)throws IOException {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the file name which u want to create");
        String fname = sc.nextLine();
        File f = new File(fname);
        FileWriter w = new FileWriter(f,true);
        System.out.println("Enter ur detail like name,regnum and cgpa etc");
        String detail = sc.nextLine();
        w.write(detail);
        w.close();
        int i=0;
        FileReader r = new FileReader(fname);
        while ((i=r.read())!=-1) {
            System.out.println((char)i);
        }
    }
}
