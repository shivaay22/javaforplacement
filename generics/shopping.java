class Shouping<T,P,V>
{
    T totalItem;
    P title;
    V price;
    Shouping(T totalItem, P title, V price)
    {
        this.totalItem = totalItem;
        this.title = title;
        this.price = price; 
    }
    void showData()
    {
        System.out.println("TotalItem: " + totalItem + " Title: " + title + "Price: " + price);
    }
}
public class shopping
{
    public static void main(String[] args) {
        Shouping <Integer,String,Double> obj1 =  new Shouping(10, "ItemName", 10.0);
        obj1.showData();
    }
}