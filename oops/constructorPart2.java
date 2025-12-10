import java.security.SignedObject;

class Student{
    int age;

    Student(){
        super();
        age = 18;
        // super();
        System.out.println("Object has benn created");
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Car Created");
    }
}

class DatabaseConnection{
     private static DatabaseConnection instance = new DatabaseConnection();

     private DatabaseConnection(){
        System.out.println("Connecting to database");
     }

     public static DatabaseConnection getInstance(){
        return instance;
     }

     public void query(String sql){
        System.out.println("Executing query: " + sql);
     }
}

public class constructorPart2 {
    
    public static void main(String[] args) {
        // Student s = new Student();
        // System.out.println(s.age);
        Vehicle v1 = new Vehicle();
        Car C1 = new Car();

        
    }
}