interface parent1
{
    void meth1();
    void meth2();
}
interface child1 extends parent1
{
    void meth3();
    void meth4();
}
class method implements child1
{
    public void meth3()
    {
        System.out.println("Math(3)");
    }
    public void meth4()
    {
        System.out.println("Math(4)");
    }
    public void meth1()
    {
        System.out.println("Math1");
    }
    public void meth2()
    {
        System.out.println("Math2");
    }
}
public class inheritinterfaces {
    public static void main(String[] args) {
        method m1 = new method();
        m1.meth1();
    }
}
