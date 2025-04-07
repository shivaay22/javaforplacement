
class base
{
    base()
    {
        System.out.println("Mai base ka hu");
    }
    base(int x)
    {
        System.out.println("mai overload hoon: " + x);
    }
}
class derived extends base
{
    derived()
    {
        super(0);
        System.out.println("Mai derived ka hoon");
    }

    derived(int x,int y)
    {
        super(x);
        System.out.println("Mai x hoon or y v hoon : " + y);
    }
}

class childclass extends derived{
    childclass()
    {
        System.out.println("Mai default child honn");
    }
    childclass(int x,int y,int z)
    {
        super(x, y);
        System.out.println("Mai x y or z wala hooon : " + z);
    }
}

public class constructorinhetritance {
    public static void main(String[] args) {
        // derived d1 = new derived(4,5);
        // base b1 = new base();
        childclass c1 = new childclass(0, 1, 2);
    }
}
