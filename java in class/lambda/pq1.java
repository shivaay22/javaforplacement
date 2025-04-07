
interface Result {
    float showcgpa();
}
public class pq1 {
    public static void main(String[] args) {
        // Result ob = () -> {return 7.1F;}; 
        // System.out.println("CGPA: " + ob.showcgpa());

        Result obj = () ->
        {
            return 7.1f;
        };
        System.out.println(obj.showcgpa());
    }
}

