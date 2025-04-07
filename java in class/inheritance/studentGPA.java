    /*
     final class graduted // u cant inherit the final class
     {
     }
     class studnentGpa extends Graduated
     */
    
public class studentGPA {
    //public static final float cgpa=8.8f;//u declare
    //public static final float c;//value is needed when u declare the contant
    void check()
    {
        //cgpa=cgpa--; we can't chnage the val
        //system.out.println(cgpa);
    }
    /*
     final void get()//u cannot inherit the final member of the class
     {

     }
     */
}
class child extends studentGPA
{
    final void get()
    {
        
    }
}