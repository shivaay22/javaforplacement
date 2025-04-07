import java.util.Scanner;

interface BookOrder {
    double order(String name, int numItem);
}

public class pq2 {
    public static void main(String[] args) {
        BookOrder ob = (name, numItem) -> {
            double cost = calcCost(name, numItem);
            System.out.println("Order placed: " + numItem + " " + name + ", Cost: $" + cost);
            return cost;
        };

        double totalBill = 0;
        totalBill += ob.order("Book1", 2);
        totalBill += ob.order("Book2", 1);
        totalBill += ob.order("Book3", 3);

        System.out.println("Total bill amount: $" + totalBill);
    }

    private static double calcCost(String name, int numItem) {
        switch (name) {
            case "Book1":
                return 10.0 * numItem;
            case "Book2":
                return 15.0 * numItem;
            case "Book3":
                return 20.0 * numItem;
            default:
                return 0;
        }
    }
}




