import java.util.ArrayList;
public class Faculty
{
    int id;
    String name;
    Faculty(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void updateDetails(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "Faculty Name is " + name + " And faculty id is : " + id;
    }
    public static void main(String[] args) {
        ArrayList<Faculty> l = new ArrayList<Faculty>();
        l.add(new Faculty(10, "NAAM"));
        l.add(new Faculty(20, "NAAMNAAM"));
        for(Faculty f:l)
        {
            System.out.println(f); 
        }
        l.get(1).updateDetails("null");
        for(Faculty f:l)
        {
            System.out.println(f);
        }
    }
}