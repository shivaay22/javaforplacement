import java.util.*;
public class Customer {
    int PHNUM;
    String name;
    int validity;
    Customer(int PHNUM,String name,int validity)
    {
        this.PHNUM = PHNUM;
        this.name = name;
        this.validity = validity;
    }
    void updatePHNUM(int PHNUM)
    {
        this.PHNUM = PHNUM;
    }
    void updateName(String name)
    {
        this.name = name;
    }
    void updateValidy(int validity)
    {
        this.validity = validity;
    }
    public String toString()
    {
        return " Phone NUmber: " + PHNUM + " Name : " + name + " Validity: " + validity;
    }
    public static void main(String[] args) {
        ArrayList<Customer> l = new ArrayList<Customer>();
        l.add(new Customer(1425, "NAAM1", 1));
        l.add(new Customer(4758, "NAAM2", 2));
        l.add(new Customer(4751, "NAAM3", 3));
        // for(Customer f:l)
        // {
        //     System.out.println(f); 
        // }
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        System.out.println("After Updation");
        l.get(1).updateName("NAAM4");
        l.get(2).updatePHNUM(10);
        for(Customer f:l)
        {
            System.out.println(f);
        }
    }
}

