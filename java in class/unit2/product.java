import java.util.Scanner;
public class product {
    String name;
    int price;
    int quantity;
    product(String name)
    {
        this.name = name;
        System.out.println(name);
    }
    product(String name,int price)
    {
        this(name);
        this.price = price;
        System.out.println(price);
    }
    product(String name,int price,int quantity)
    {
        this(name, price);
        this.quantity = quantity;
        System.out.println(quantity);
    }
    public static void main(String[] args) {
       product p1 = new product("Bike");
       product p2 = new product("bike", 152112);
       product p3 = new product("Bike", 152113, 1);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total number of product: ");
       int n = sc.nextInt();
       product obj[] = new product[n];
       for(int i=0;i<n;i++)
       {
        System.out.println("Enter the name of product");
            String name = sc.next();
        System.out.println("Enter price");
            int price = sc.nextInt();
        System.out.println("Enter the quantity of product");
            int q = sc.nextInt();
            sc.nextLine();
        obj[i] = new product(name, price, q);
       }
       for(int i=0;i<n;i++)
       {
        System.out.print("Name: " +  obj[i].name + "price: " + obj[i].price + "quantity: " + obj[i].quantity);
       }
       System.out.println();
    }
}
