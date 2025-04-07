import java.io.*;

class Student implements Serializable {
    String name;
    float cgpa;
    String companyName;

    Student(String name, float cgpa, String companyName) {
        this.name = name;
        this.cgpa = cgpa;
        this.companyName = companyName;
    }
}
public class studentSerialization {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("ravi", 5.0f, "Apple");
        Student s2 = new Student("navi", 6.0f, "Google");
        Student s3 = new Student("kavi", 7.0f, "Adobe");
        
        FileOutputStream fileOut = new FileOutputStream("f2.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(fileOut);
        o1.writeObject(s1);
        o1.writeObject(s2);
        o1.writeObject(s3);
        System.out.println("Stored the objects in the file");
        FileInputStream fileIn = new FileInputStream("f2.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        
        Student so1 = (Student) objectIn.readObject();
        // System.out.println(so1.name + " " + so1.cgpa + " " + so1.companyName);

        Student so2 = (Student) objectIn.readObject();
        System.out.println(so2.name + " " + so2.cgpa + " " + so2.companyName);

        Student so3 = (Student) objectIn.readObject();
        System.out.println(so3.name + " " + so3.cgpa + " " + so3.companyName);
        
        objectIn.close();
    }
}
