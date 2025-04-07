public class instance {
    String moviename;
    String personname;
    int ticketprice;
    static int totalticket;
    void get(String moviename,String personame,int ticketprice)
    {
        // this.moviename = moviename;
        System.out.print("Moviename: " + moviename + " ");
        // this.personname = personame;
        System.out.print("personname: " + personame + " ");
        // this.ticketprice = ticketprice;
        System.out.print("Ticketprice: " + ticketprice + " ");
        totalticket++;
        System.out.println();
    }
    public static void main(String[] args) {
        instance i1 = new instance();
        i1.get("Animal", "Bhardwajjee", 100);
        instance i2 = new instance();
        i1.get("Animal1", "Bhardwajjee1", 101);
        System.out.println(totalticket);
    }
}
