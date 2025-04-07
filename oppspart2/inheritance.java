public class inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
    }
}
class Animal
{
    String color;

    void eat()
    {
        System.out.println("Eat");
    }

    void breathe()
    {
        System.out.println("Breaths");
    }
}
class Fish extends Animal
{
    int fins;

    void swims()
    {
        System.out.println("Swim in  water");
    }
    void eat()
    {
        System.out.println("Fish curryy cfsjfqwipofoafslkvnlw");
    }
}