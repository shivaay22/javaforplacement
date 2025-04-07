
class classA
{
    public void kuchv()
    {
        System.out.println("Main class A hoon");
    }
}

class classB extends classA
{
    public void kuchv()
    {
        System.out.println("main class b hoon");
    }
}

public class override {
    public static void main(String[] args) {
        classA b1 = new classB();
        b1.kuchv();
    }
}
