public class abstractclass {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.walks();
    }
}
abstract class Animal
{
    String name;
    void setname(String name)
    {
        name = name;
        
    }
    abstract void walks();
}
class mammals extends Animal
{
    void walks()
    {
        System.out.println("Walk in water");
    }
}
class dog extends Animal
{
    void walks()
    {
        System.out.println("Walk on 4 leg");
    }
}