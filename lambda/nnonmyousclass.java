interface annon
{
    public void meth1();
    public void meth2();
}
public class nnonmyousclass {
    public static void main(String[] args) {
        annon ob = new annon() {
            public void meth1()
            {
                System.out.println("This is meth1");
            }
            public void meth2()
            {
                System.out.println("This is meth2");
            }
        };
        ob.meth1();
        ob.meth2();
    }
}
