public class overDemo {
    void get()
    {
        System.out.println("Non static from parent class");
    }
    static void show()
    {
        System.out.println("Static from parent class");
    }
}
    class childemo extends overDemo
    {
        void get()
        {
            System.out.println("Non static from child class");
        }
        static void show()
        {
            System.out.println("static from childclass");
        }
        public static void main(String[] args) {
            overDemo o1 = new childemo();//here refrence of parent but instance of child
            o1.get();//it will print the override on static method of child class
            o1.show();//it will print the parent class static method cos static method cannot be overrided n it get hided so on


            childemo o2 = new childemo();
            o1.get();//it will print the override non static method of child class
            o1.show();//it will act as own method of child class so u will get the output of child class non static method
        }
    }

