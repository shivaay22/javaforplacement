// import java.security.Permission;

public class person {
    void get()
    {
        System.out.println("person");
    }
    void dis()
    {
        System.out.println("person");
    }
}
class Emp extends person
{
    void get()
    {
        System.out.println("Emp");
    }
    void display()
    {
        System.out.println("Emp person");
    }
}
class student extends person
{
    void get()
    {
        System.out.println("Student");
    }
    void display()
    {
        System.out.println("Student Person");
    }
}
class result
{
    public static void main(String arga[])
    {
        result t = new result();
        person p = new Emp();
        person p1 = new student();
    }
    void getResult(person p)
    {
        if(p instanceof student)
        {
            student e = (student)p;
            e.get();
            e.display();
        }
        else if(p instanceof Emp)
        {
            Emp e = (Emp)p;
            e.get();
            e.display();
        }
    }
}
