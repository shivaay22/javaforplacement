class A
{
    int a,b;
    public void add(int x,int y)
    {
        a = x;
        b = y;
        System.out.println("Add: " + (a+b));
    }
}

class B extends A{
    public void sum(int x, int y)
    {
        add(x, y);
    }
}

public class ingeritanceadd {
    
    public static void main(String[] args) {
        B b1 = new B();
        b1.add(5, 6);
    }
}
