public class multilevel {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "kuch v";
        System.out.println(d1.name);
    }
}
class Animal
{
    String name;
    int legs;
    void setname(String name)
    {
        name = name;
    }
}
class mammals extends Animal
{
    String color;
    void setcolor(String color){
        color = color;
    }
}
class Dog extends mammals
{
    String bark;

    void setbark(String barks)
    {
        barks = barks;
    }
}
