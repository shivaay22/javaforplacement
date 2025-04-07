class thread1 implements Runnable
{
    public void run()
    {
    int i = 1;
    while(i<40)
    {
        System.out.println("This is thread1");
        i++;
    }
}
}
class thread2 implements Runnable
{
    public void run()
    {
        int i = 1;
        while(i<40)
        {
        System.out.println("This is thread 2");
        i++;
        }
    }
}
public class ruunablle {
    public static void main(String[] args) {
        
    thread1 bullet1 = new thread1();
    Thread gun1 = new Thread(bullet1);

    thread2 bullet2 = new thread2();
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();
    }
}
