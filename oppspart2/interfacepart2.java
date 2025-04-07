// interface motorcycle
// {
//     public void start(int increment);
//     public void end(int decrement);
// }
// interface gaddikhorn
// {
//     public void truckkhorn();
//     public void tractorkhorn();
// }
// class bike implements motorcycle,gaddikhorn
// {
//     public void start(int n)
//     {
//         System.out.println("Start ho jaa");
//     }
//     public void end(int d)
//     {
//         System.out.println("rook ja");
//     }
//     public void tractorkhorn()
//     {
//         System.out.println("poon poon po po po po po poon");
//     }
//     public void truckkhorn()
//     {
//         System.out.println("jani jani hm baani animal");
//     }
// }

interface university
{
    public void department();
    public void school();
}
interface college
{
    public void proffesor();
    public void student();
}

class education implements university,college
{
    public void department()
    {
        System.out.println("Deparment");
    }
    public void school()
    {
        System.out.println("School");
    }
    public void proffesor()
    {
        System.out.println("Proffessor");
    }
    public void student()
    {
        System.out.println("Student");
    }
}
public class interfacepart2 {
    public static void main(String[] args) {
        // bike b1 = new bike();
        // b1.tractorkhorn();
        education e1 = new education();
        e1.department();
        e1.school();
        e1.proffesor();
        e1.student();
    }
}
