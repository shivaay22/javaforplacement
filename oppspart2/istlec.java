class pen
{
    String name;
    int price;
    String color;

    void setname(String name)
    {
        name = name;
    }
    void price(int price)
    {
        price = price;
    }
}
class pencil
{
    String name;
    int price;
    String color;

    void setname(String name)
    {
        name = name;
    }
    void price(int price)
    {
        price = price;
    }
}

class bankaccount
{
    public String name;
    private int password;

    void setname(String name)
    {
        name = name;
    }

    void setpwd(int password)
    {
        password = password;
    }

}
public class istlec {

     public static void main(String[] args) {
        pen p1 = new pen();
        p1.name = "Saino softek";
        p1.color = "blue";
        p1.price = 5;
        System.out.println(p1.name);
        System.out.println(p1.color);
        System.out.println(p1.price);

        bankaccount b1 = new bankaccount();
        b1.setpwd(12345); //only we can change not to print from class
        
     }
}