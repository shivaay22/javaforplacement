import java.util.Scanner;

interface hostelBooking{
    int bookRoom();
}
public class HostelBooking {
    public static void main(String[] args) {
        hostelBooking h1 = new hostelBooking()
        {
        public int bookRoom()
        {
            System.out.println("Amount for 3 seater is 70000");
            System.out.println("Amount for 4 seater is 60000");
            System.out.println("Amount for 5 seater is 50000");
            System.out.println("Amount for 6 seater is 40000");

            Scanner sc = new Scanner(System.in);
            int amt = sc.nextInt();
            if(amt == 70000)
            {
                System.out.println("u booked 3 setaer");
            }
            else if(amt == 6000)
            {
                System.out.println("U booked 4 seater");
            }
            else if(amt == 5000)
            {
                System.out.println("U booked 5 seater");
            }
            else if(amt == 4000)
            {
                System.out.println("U booked 6 seater");
            }
            return amt;
        }
    };
    h1.bookRoom();
}
}
