public class lec1st {
    public  static class vehicle
    {
        String name;
        int model_num;
        void show()
        {
            System.out.println(" ");
        }
    }
    static class car extends vehicle // use extends keyword to inherit the class
    {
        void show() // using the property of parent class
        {
            name = "swift";
            model_num = 34567;
            System.out.println(name + " " + model_num);
        }
        void credential() // its own property
        {
            System.out.println("car ride");
        }
    } 
    static class bike extends vehicle // use extends keyword to inherit the class
    {
        void show() // using the property of parent class
        {
            name="pulsar";
            model_num=367;
            System.out.println(name + " " + model_num);
        }
        void bikedetail() // its own property
        {
            System.out.println("bike ride");
        }
    } 
    public static void main(String[] args) {
        bike b = new bike(); // reference of child n instance of child so it will call all the method od its own as well as inherited
        b.show();
        b.bikedetail();
        car c = new car();
        c.show();
        c.credential();
    }
}
