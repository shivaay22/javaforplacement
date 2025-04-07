import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SerializationObject {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("ravi", 2);
        Student s2 = new Student("navi", 221);
        Student s3 = new Student("kavi", 100);
        
        // Writing objects to file
        FileOutputStream fileOut = new FileOutputStream("f.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(s1);
        objectOut.writeObject(s2);
        objectOut.writeObject(s3);
        objectOut.close();
        System.out.println("Stored the objects in the file");

        // Reading objects from file
        FileInputStream fileIn = new FileInputStream("f.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        
        Student so1 = (Student) objectIn.readObject();
        System.out.println(so1.name + " " + so1.age);

        Student so2 = (Student) objectIn.readObject();
        System.out.println(so2.name + " " + so2.age);

        Student so3 = (Student) objectIn.readObject();
        System.out.println(so3.name + " " + so3.age);
        
        objectIn.close();
    }
}
