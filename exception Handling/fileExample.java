import java.io.*;

public class fileExample {
    public static void main(String[] args) {
        try {
            // Creating a File object
            File f = new File("demo2.txt");
            
            // Creating a FileWriter object with append mode enabled
            FileWriter w = new FileWriter(f, true);
            
            // Writing to the file
            w.write("Lpu vertos\n"); // Make sure to include '\n' to add a newline
            
            // Closing the FileWriter
            w.close();
            
            // Creating a FileReader object
            FileReader r = new FileReader(f);
            
            // Reading from the file
            int i = 0;
            while ((i = r.read()) != -1) {
                System.out.print((char) i); // Use print instead of println to print without newline
            }
            
            // Closing the FileReader
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
