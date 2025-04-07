import java.util.Scanner;
// 371 = (3*3*3)+(7*7*7)+(1*1*1)  
// where:  
// (3*3*3)=27  
// (7*7*7)=343  
// (1*1*1)=1  
// So:  
// 27+343+1=371  
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int temp = num;
        
        int sum = 0;
        int count = Integer.toString(num).length();
        while(num>0)
        {
            int ld = num % 10;
            // count++;
            sum = sum + (int)Math.pow(ld, count); // sum += (ld*ld*ld)
            num = num / 10;
        }
        if(temp == sum)
        {
            System.out.println("Armsstrong number: " + temp);
        }
        else
        {
            System.out.println("Not Armstrong number: " + temp);
        }

        System.out.println(count);
    }


    
}
