// interface c{
//     void +(); //to implement lambda expression u must use functional interface which has only one
//     // abstract method but it can contain multiple default method
//     void demo();//u cant declare more than one function in functional interface to implement laambda expression
// }
// public class lambdademo1 {
//     public static void main(String[] args) {
//         calculator ob=()->System.out.println(10+10);
//         lambdademo1 l1 = new lambdademo1();
        
//     }
// }


interface Calculator {
    void calculate(); // Functional interface with a single abstract method
    // void demo();//u cant declare more than one function in functional interface to implement lambda expresssion 
}

public class lambdademo1 {
    public static void main(String[] args) {
        // Lambda expression implementing the calculate method
        Calculator ob = () -> System.out.println(10 + 10);
        
        // Creating an instance of LambdaDemo1 (not used in this example)
        // lambdademo1 l1 = new lambdademo1(); u cant intiate the interface
        
        // Calling the calculate method using the lambda expression
        ob.calculate(); // This will print 20 to the console

        Calculator ob1=()->System.out.println(10*10);
        ob1.calculate();
    }
}
