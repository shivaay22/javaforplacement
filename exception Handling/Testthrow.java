import java.io.IOException;

// public class Testthrow {
//     void m() throws IOException
//     {
//         throw new IOException("Device error");
//     }
//     void n()throws IOException
//     {

//         m();
//     }
//     void p()
//     {
//         try{
//             n();
//         }
//         catch(Exception e)
//         {
//             System.out.println("Exception handled");
//         }
//     }
//     public static void main(String args[])
//     {
//         Testthrow t1 = new Testthrow();
//         t1.p();
//         System.out.println("normal flow");
//     }
// }


public class Testthrow {
    void m() throws IOException
    {
        throw new IOException("Device error");
    }
    void n()throws IOException
    {

        m();
    }
    void p()
    {
        try{
            n();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        Testthrow t1 = new Testthrow();
        t1.p();
        System.out.println("normal flow");
    }
}
