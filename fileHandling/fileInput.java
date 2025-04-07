import java.util.*;
import java.io.*;

public class fileInput {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fout = new FileOutputStream("testout111.txt");
            Scanner sc = new Scanner(System.in);
            String let = sc.nextLine();
            fout.write(let.getBytes());
            String l = sc.nextLine();
            fout.write(l.getBytes());
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Enter file: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); // Close the scanner for user input
        FileInputStream inFile = new FileInputStream(str);
        Scanner st = new Scanner(inFile);
        while (st.hasNextLine()) {
            String line = st.nextLine(); // Corrected to use 'st' instead of 'sc'
            System.out.println(line);
        }
        inFile.close(); // Close the FileInputStream
        st.close(); // Close the Scanner reading from the file
    }
}
