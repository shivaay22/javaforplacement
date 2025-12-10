class Demo {
    static int staticVar = 10;  // Shared by all objects
    int nonStaticVar = 10;      // Separate for each object

    void modify() {
        staticVar++;
        nonStaticVar++;
    }

    // void display() {
    //     System.out.println("StaticVar: " + staticVar + ", NonStaticVar: " + nonStaticVar);
    // }

    void print()
    {
        System.out.println( "static: " + staticVar);
        System.out.println("non Staic: " + nonStaticVar);
    } 


}

public class Static {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

       
        obj1.modify();
        obj1.print();


        obj1.modify();
        obj1.print();


        // obj1.modify();
        // obj1.print();


        // obj1.modify();
        // obj2.print();
        // obj2.print();


       
    }
}
