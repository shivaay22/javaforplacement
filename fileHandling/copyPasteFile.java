import java.util.*;
import java.io.*;
public class copyPasteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fout = new FileOutputStream("userInformation.txt");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            fout.write(name.getBytes());
            System.out.println("Enter email");
            String email = sc.nextLine();
            fout.write(email.getBytes());
            fout.close();
            System.out.println("Success writing to file...");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("Enter file to want paste the dat: ");
        String cFname = sc.next();
        FileOutputStream pfout = new FileOutputStream(cFname);
        System.out.print("Enter the file name from which u want to copy the data");
        String rfname = sc.next();
        FileInputStream inFile =  new FileInputStream(rfname); 
        Scanner st = new Scanner(inFile);
        while (st.hasNextLine()) {
            String line = st.nextLine();
            pfout.write(line.getBytes());
        }
    }
}
