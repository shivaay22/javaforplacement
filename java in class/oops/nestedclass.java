// class person
// {
//     private int age = 25;
//     String name = "Shailja";
//     void details()
//     {
//         System.out.println("Person with age " + age + " and the name of person is " + name);
//     }
//     class Adharcard
//     {
//         void genrateAdharId()
//         {
//             int uid = 8967;
//             System.out.println("Person with age " + age + "is having a adhar id " + uid);
//         }
//     }
// }
// public class nestedclass {
//     public static void main(String[] args) {
//         person p1 = new person();
//         p1.details();
//         Adharcard a1 = p1.new Adharcard();
//         a1.genrateAdharId();
//     }
// }

// Nested Class
// class Person { //Outer class
//     private int age = 25;//lets
//     String name = "Shailja";
    
//     void details() {
//         System.out.println("Person with age " + age + " and the name of person is " + name);
//     }
    
//     class Adharcard {
//         void generateAdharId() {
//             int uid = 8967;
//             System.out.println("Person with age " + age + " is having an Aadhar ID " + uid);
//         }
//     }
// }


class student
{
    private int age = 25;
    private int id = 22;

    void details()
    {
        System.out.println("Age: " + age + "Id: " + id);
    }

    class Adharcard
    {
        int uid = 1425;
        
        void detailsofAdhar()
        {
            System.out.println("age: " + age + "UID: " + uid);
        }
    }
}

public class nestedclass {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.details();
        // Person.Adharcard a1 = p1.new Adharcard();
        // a1.generateAdharId();
        student s1 = new student();
        s1.details();

        student.Adharcard a1 = s1.new Adharcard();
        a1.detailsofAdhar();
    }
}

