
class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Ruunable: " + i);
        }
    }
}
public class lamdademo4 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main: " + i);
        }

    }
}
