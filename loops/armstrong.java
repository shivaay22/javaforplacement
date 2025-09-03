// import java.util.Scanner;
// 371 = (3*3*3)+(7*7*7)+(1*1*1)  
// where:  
// (3*3*3)=27  
// (7*7*7)=343  
// (1*1*1)=1  
// So:  
// 27+343+1=371  
public class armstrong {
    public static void armNumber(int num)
    {
        // int len = Integer.toString(num).length();

        int digit = num;
        int count = 0;

        // String ans = Integer.toString(num);

        while(digit != 0)
        {
            count++;
            digit = digit / 10;
        }


        int temp = num;
        int sum = 0;
        while(num != 0)
        {
            int ld = num % 10;
            sum = sum + (int) Math.pow(ld, count);
            num = num / 10;
        }

        if(temp == sum)
        {
            System.out.println("This is ArmStrong");
        }
        else
        {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter num: ");
        // int num = sc.nextInt();
        // int temp = num;
        
        // int sum = 0;
        // int count = Integer.toString(num).length();
        // // int count = 0;
        // while(num>0)
        // {
        //     int ld = num % 10;
        //     // count++;
        //     sum = sum + (int)Math.pow(ld, count); // sum += (ld*ld*ld)
        //     num = num / 10;
        // }
        // if(temp == sum)
        // {
        //     System.out.println("Armsstrong number: " + temp);
        // }
        // else
        // {
        //     System.out.println("Not Armstrong number: " + temp);
        // }

        // System.out.println(count);

        armNumber(245);
    }


    
}
