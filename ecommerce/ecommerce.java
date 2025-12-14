// package ecommerce;

class Product{
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

     void displayInfo() {
        System.out.println(name + " | Price: " + price + " | Stock: " + quantity);
    }
}

class ShoppingCart{

    Product[] items = new Product[10];
    int count = 0;

    void addProduct(Product p){
        items[count] = p;
        count++;

        System.out.println("name: " + p.name);
    }
     void viewCart() {
        System.out.println("Items in Cart:");
        for (int i = 0; i < count; i++) {
            items[i].displayInfo();
    }
}
}

class Customer {
    String name;
    String email;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayCustomer() {
        System.out.println("Customer: " + name + ", Email: " + email);
    }
}

class Order{
    Customer customer;
    ShoppingCart cart;
    double totalAmount;

    Order(Customer customer, ShoppingCart cart){
        this.customer = customer;
        this.cart = cart;
        calculateTotal();
    }

    void calculateTotal(){
        double sum = 0;
        for(int i=0;i<cart.count;i++){
            sum += cart.items[i].price;
        }
        totalAmount = sum;
    }

    void printOrder() {
        customer.displayCustomer();
        cart.viewCart();
        System.out.println("Total Amount: " + totalAmount);
    }
}

class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount;
    }

    void pay(){
        System.out.println("Payement done: " + amount);
    }
}

class UpiPayment extends Payment{
    String upiId;

    UpiPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }

   void pay() {
        System.out.println("Paid " + amount + " via UPI (" + upiId + ")");
    }
}

class SeasonalDiscount{
    Product p;
    double amount;

    public double applyDiscount(double amount){
        this.amount = amount;
        double da = p.price - amount;
        return amount;
    }
}

public class ecommerce {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000, 5);
        Product p2 = new Product("Laptop", 55000, 5);

        // p1 != p2 because identity is different

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);

        // cart.viewCart();

        Customer c1 = new Customer("Shivam", "shivam@gmail.com");
        Order order1 = new Order(c1, cart);
        order1.printOrder();

        UpiPayment upi = new UpiPayment(order1.totalAmount, "shivam@upi");
        upi.pay();





        
    }
    
} 
