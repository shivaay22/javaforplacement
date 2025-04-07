public class staticclass {
    String moviename;
    String personname;
    int ticketprice;
    static int totalticket;
    public void get(String moviename,String personname,int ticketprice)
    {
        System.out.println(moviename);
        System.out.println(personname);
        System.out.println(ticketprice);
        totalticket++;
    }
    public static void main(String[] args) {
        staticclass s1 = new staticclass();
        // s1.get("Animal", "Bhardwajee", 100);
        // System.out.println(totalticket);

        s1.get("NAMM", "PRSON", 50);
        System.out.println(totalticket);
    }
}
