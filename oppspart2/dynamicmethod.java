
class phone
{
    public void greet()
    {
        System.out.println("good morning");
    }

    public void on()
    {
        System.out.println("Turning on phone.....");
    }
}

class smartPhone extends phone
{
    public void swagat()
    {
        System.out.println("Apka swagat hai");
    }
    public void on()
    {
        System.out.println("Turning on the Smartphone.....");
    }
}

public class dynamicmethod {
    public static void main(String[] args) {
        phone p1 = new smartPhone();
    }
    
}