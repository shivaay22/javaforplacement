class carLeaderShip
{
    private String name;
    private int establishedYear;
    private Car car;
    carLeaderShip(String name,int establishedYear)
    {
        this.name = name;
        this.establishedYear = establishedYear;
    }
   public void setCar(Car car)
   {
    this.car = car;
   }
   public String getName()
   {
    return name;
    }
    public int getestablishedYear()
    {
        return establishedYear;
    }
    public class Car
    {
        private String brand;
        private String Model;
        private int year;
        public Car(String brand,String Model,int year)
        {
            this.brand = brand;
            this.Model = Model;
            this.year = year;
        }
        public String getbrand()
        {
            return brand;
        }
        public String getModel()
        {
            return Model;
        }
        public int getYear()
        {
            return year;
        }
        public void displayCarInfo()
        {
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Model: " + Model);
            System.out.println("Car year: " + year);
        }
    }
}
public class carNestedClass {
    public static void main(String[] args) {
        //creaing a CarLeaderShip instance
        carLeaderShip myDealership = new carLeaderShip("your dealerShip", 1993);
        //creaing a car instance
        carLeaderShip.Car myCar = myDealership.new Car("Toyoto","Camry",2022);
        //Setting the Car for the dealerShip
        myDealership.setCar(myCar);
        // Display car Information
        myCar.displayCarInfo();
    }
}
