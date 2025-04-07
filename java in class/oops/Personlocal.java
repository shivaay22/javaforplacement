
// public class Personlocal {
//     String name = "Nisha";
//     int age = 18;
//     void license()
//     {
//         if(age>=178)
//         {
//             int lic = 678;//loacl var
//             int reqid=90;//one more local to check the effectively final property
//             class license
//             {
//                 void generate()
//                 {
//                     System.out.println("genearted for "+name+" having an age " + age + " and the licnum is " + lic);
//                     // System.out.println(lic++);
//                     //error cause lic will act effectively final for local class
//                 }
//             }
//             license l1 = new license();
//             l1.generate();
//             System.out.println(reqid++);//its a local var n we can change the value vut for local class ita a effectively final
//         }
//     }
//     public static void main(String[] args) {
//         Personlocal p1 = new Personlocal();
        
//     }
// }

public class Personlocal {
    String name = "Nisha";
    int age = 18;

    void license() {
        if (age >= 18) {
            int lic = 678; // local var
            int reqid = 90; // one more local to check the effectively final property
            class License {
                void generate() {
                    System.out.println("Generated for " + name + " having an age " + age + " and the licnum is " + lic);
                    // System.out.println(lic++);
                    // Error: lic will act effectively final for local class
                }
            }
            License l1 = new License();
            l1.generate();
            System.out.println("reqid before modification: " + reqid); // It's a local var and we can change the value
            reqid++;
            System.out.println("reqid after modification: " + reqid);

        }
    }

    public static void main(String[] args) {
        Personlocal p1 = new Personlocal();
        p1.license();
    }
}
