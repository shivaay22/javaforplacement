interface books
{
    public double fun(String name,int noofitems);
}
public class bookbill {
    public static void main(String[] args) {
        books obj = (name,noofitems) ->
        {
            double cost = calcCost(name,noofitems);
            System.out.println();
            return cost;
        };
        double totalBill = 0;
        totalBill += obj.fun("Book1",2);
    }
    public static double calcCost(String name,int noofitems)
    {
        switch (name) {
            case "Book1":
                return 10.0*noofitems;
            case "Book2":
                return 20.0*noofitems;
            default:
                return 0;
        }
    }
}
