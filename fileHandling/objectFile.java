import java.io.Serializable;
import java.io.*;
class Student implements Serializable
{
    int id;
    String name;
    public Student(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}
public class objectFile {
    public static void main(String[] args)throws IOException {
        Student s1 = new Student(2, "Ravi");
        Student s2 = new Student(221, "navi");
        Student s3 = new Student(100, "kavi");
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.writeObject(s2);
        out.writeObject(s3);
        out.flush();
        System.out.println("Success");
    }
}
