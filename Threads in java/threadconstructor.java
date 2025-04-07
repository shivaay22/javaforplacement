class mythread extends Thread
{
    mythread(String name)
    {
        super(name);
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        mythread t1 = new mythread("Kuch v");
        mythread t2 = new mythread("Null");
        t1.start();
        t2.start();
        System.out.println("ID: " + t1.getId());
        System.out.println("Name: " + t1.getName());
        System.out.println("ID: " + t2.getId());
        System.out.println("Name: " + t2.getName());
    }
}
