import java.util.*;
public class farenheight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        double cle[] = new double[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
            cle[i] = ((5.0/9.0) * (arr[i] -32));
        }
        for(int i=0;i<n;i++)
        {
            String format = String.format("%.2f", cle[i]);
            System.out.print(format + " ");
        }
        System.out.println();
    }
}
