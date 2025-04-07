// public class asserionDemo {
//     public static void main(String[] args) {
//         int x = getPositiveInt(7);
//         int y = getPositiveInt(2);
//         assert(y>0);
//         int total = x + y;
//         System.out.println("Total: " + total);
//     }
//     public static int getPositiveInt(int num)
//     {
//         return num - 3;
//     }
// }

//File handling

import java.io.*;

class asserionDemo
{
    public static void main(String args[]) throws IOException
    {
        File f = new File("demo1.txt");
        FileWriter w = new FileWriter(f);
        w.write("Lpu Vertos 2024 jalanndhar");
        w.close();
    }
}
