public class nto1 {
    public static void Ntonum(int n)
    {
        if(n == 0)
        {
            return;
        }
        Ntonum(n-1);
        System.out.println(n);  
        // Ntonum(n-1); 
    }
    public static void main(String[] args) {
        Ntonum(5);
    }
}
