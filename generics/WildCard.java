import java.util.*;
public class WildCard {
    private static double sum(List<? extends Number>list)
    {
        double s = 0.0;
        for(Number i : list)
        {
            s = s + i.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
       List<Integer> l1 = Arrays.asList(4,5,6,7);
       System.out.println("Total sum is: " + sum(l1));
        List<Double> l2 = Arrays.asList(4.1,5.1,6.1);
       System.out.println("Total sum is: " + sum(l2));
    }
}
