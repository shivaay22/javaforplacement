class thread extends Thread
{
    public void run()
    {
        int i = 0;
        while(i<4)
        {
        System.out.println("Threads are cooking");
        System.out.println("then i am happy");
            i++;
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i<4)
        {
        System.out.println("THreads are chaatiaanig");
        System.out.println("Then in am sad");
        i++;
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        thread t1 = new thread();
        thread2 t2 = new thread2();
        t1.run();
        t2.run();
    }
}
